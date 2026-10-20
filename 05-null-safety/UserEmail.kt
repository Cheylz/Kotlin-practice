package nullsafety.useremail

// Пользователи, у которых email может отсутствовать
data class User(val name: String, val email: String?)

fun main() {
    val users = listOf(
        User("Nikita", null),
        User("Alesya", "alesya@gmail.com"),
        User("Vitalina", "vitalina@gmail.com"),
        User("Kolya", null)
    )

    // Имена тех, у кого email есть
    val withEmail = users.filter { it.email != null }.map { it.name }
    println(withEmail) // [Alesya, Vitalina]

    // Вся строка собирается шаблоном, ?: спрятан внутри ${ ... }
    for (user in users) {
        println("${user.name} : ${user.email ?: "Нет email"}")
    }
}
