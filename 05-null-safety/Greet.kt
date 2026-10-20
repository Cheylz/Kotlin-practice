package nullsafety.greet

// ?. и ?: на простых примерах
fun greet(name: String?): String {
    return "Привет, ${name ?: "гость"}!"
}

fun main() {
    val a: String? = "Kotlin"
    val b: String? = null

    println(a?.length)       // 6
    println(b?.length)       // null
    println(a?.length ?: 0)  // 6
    println(b?.length ?: 0)  // 0

    println(greet("Nikita")) // Привет, Nikita!
    println(greet(null))     // Привет, гость!
}
