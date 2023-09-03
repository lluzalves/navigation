package com.daniel.navigation.loader.activity

import android.content.Intent


private fun intentTo(intent: Intent, className: String, packageName: String): Intent =
    intent.setClassName(packageName, className)

internal fun String.loadIntentOrNull(
    intent: Intent, className: String, packageName: String
): Intent? = try {
    Class.forName(this).run { intentTo(intent, className, packageName) }
} catch (e: ClassNotFoundException) {
    null
}