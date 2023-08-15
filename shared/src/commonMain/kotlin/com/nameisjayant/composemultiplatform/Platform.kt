package com.nameisjayant.composemultiplatform

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform