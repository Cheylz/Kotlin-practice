package lambdas.applytoall

// Функции, принимающие лямбду как параметр
fun applyToAll(numbers: List<Int>, action: (Int) -> Int): List<Int> {
    val result = mutableListOf<Int>()
    for (n in numbers) {
        result.add(action(n))
    }
    return result
}

fun repeatAction(times: Int, action: () -> Unit) {
    for (i in 1..times) action()
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    println(applyToAll(numbers, { it * 2 }))  // [2, 4, 6, 8, 10]
    println(applyToAll(numbers) { it + 10 })  // [11, 12, 13, 14, 15]: лямбда вынесена за скобки
    println(applyToAll(numbers) { it * it })  // [1, 4, 9, 16, 25]
    println(applyToAll(numbers) { it - 1 })   // [0, 1, 2, 3, 4]

    repeatAction(3) { println("Hello world!") }
}
