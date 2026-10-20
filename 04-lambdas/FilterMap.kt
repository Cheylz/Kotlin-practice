package lambdas.filtermap

// filter и map над списком чисел
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val evens = numbers.filter { it % 2 == 0 }
    println(evens) // [2, 4, 6, 8, 10]

    val doubled = numbers.map { it * 2 }
    println(doubled) // [2, 4, 6, ..., 20]

    // Цепочка: квадраты только чётных чисел
    val evenSquares = numbers.filter { it % 2 == 0 }.map { it * it }
    println(evenSquares) // [4, 16, 36, 64, 100]
}
