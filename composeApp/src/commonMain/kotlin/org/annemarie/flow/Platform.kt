package org.annemarie.flow

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform