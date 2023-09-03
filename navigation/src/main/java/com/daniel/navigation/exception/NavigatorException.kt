package com.daniel.navigation.exception

class NavigatorException(message: String? = "Navigation error found, please check", cause: Throwable?) :
    Exception(message, cause) {

}