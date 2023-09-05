package rs.vegait.mrsicsasa.wififinder

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform