package enums.enumsealed

// enum, sealed class и when
enum class Direction { UP, DOWN, LEFT, RIGHT }

enum class Season { WINTER, SPRING, SUMMER, AUTUMN }

sealed class Result {
    data class Success(val data: String) : Result()
    data class Error(val message: String) : Result()
    object Loading : Result()
    object Empty : Result()
}

fun show(result: Result) {
    when (result) {
        is Result.Success -> println("Данные: ${result.data}")
        is Result.Error -> println("Ошибка: ${result.message}")
        Result.Loading -> println("Загрузка...")
        Result.Empty -> println("Данных нет")
    }
}

fun main() {
    show(Result.Loading)
    show(Result.Success("список фильмов"))
    show(Result.Empty)
    show(Result.Error("нет интернета"))

    val d = Direction.LEFT
    val text = when (d) {
        Direction.UP -> "вверх"
        Direction.DOWN -> "вниз"
        Direction.LEFT -> "влево"
        Direction.RIGHT -> "вправо"
    }
    println(text)

    for (s in Season.entries) {
        val description = when (s) {
            Season.WINTER -> "Зима"
            Season.SPRING -> "Весна"
            Season.SUMMER -> "Лето"
            Season.AUTUMN -> "Осень"
        }
        println(description)
    }
}
