package com.daniel.navigation.loader.activity

import android.content.Intent
import com.daniel.navigation.exception.NavigatorException


private fun intentTo(intent: Intent, className: String, packageName: String): Intent =
    intent.setClassName(packageName, className)

internal fun String.loadIntentOrThrowException(
    intent: Intent, className: String, packageName: String
): Intent? = try {
    Class.forName(this).run { intentTo(intent, className, packageName) }
} catch (e: ClassNotFoundException) {
    throw NavigatorException("Activity does not exist: ${e.localizedMessage}",Throwable(e.exception))
}