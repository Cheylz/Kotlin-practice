package loops.multiplicationtable

// Таблица умножения от 1 до 9: цикл внутри цикла
fun main() {
    for (i in 1..9) {
        for (j in 1..9) {
            println("$i x $j = ${i * j}")
        }
    }
}
