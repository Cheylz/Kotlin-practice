package lists.summaxeven

// Сумма, максимум и количество чётных чисел в списке
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 123)
    var sum = 0
    var evenCount = 0
    var max = numbers[0]

    for (n in numbers) {
        sum += n
        if (n % 2 == 0) {
            evenCount++
        }
        if (n > max) {
            max = n
        }
    }

    println("Сумма: $sum")        // 178
    println("Чётных: $evenCount") // 5
    println("Максимум: $max")     // 123
}
