package com.daniel.navigation.loader

import com.daniel.navigation.exception.NavigatorException


private val classMap = mutableMapOf<String, Class<*>>()

private inline fun <reified N : Any> Any.castOrThrowException() = this as? N

internal fun <N> String.loadClassOrThrowException(): Class<out N>? =
    classMap.getOrPut(this) {
        try {
            Class.forName(this)
        } catch (e: ClassNotFoundException) {
            throw NavigatorException(e.localizedMessage, e.cause)
        }
    }.castOrThrowException()
