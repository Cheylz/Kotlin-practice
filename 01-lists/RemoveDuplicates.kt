package lists.removeduplicates

// Удаление дубликатов без distinct(), порядок первого появления сохраняется
fun main() {
    val numbers = listOf(1, 2, 2, 3, 3, 4, 4, 5)
    val result = mutableListOf<Int>()

    for (number in numbers) {
        if (number !in result) {
            result.add(number)
        }
    }

    println(result) // [1, 2, 3, 4, 5]
}
