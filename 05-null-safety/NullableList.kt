package nullsafety.nullablelist

// Работа со списком, в котором могут быть null
fun main() {
    val names: List<String?> = listOf("Аня", null, "Борис", null, "Вика")

    // 1. Только непустые имена (тип результата List<String>)
    println(names.filterNotNull()) // [Аня, Борис, Вика]

    // 2. Сколько в списке null
    var countNull = 0
    for (name in names) {
        if (name == null) {
            countNull++
        }
    }
    println(countNull) // 2

    // 3. Длины имён, для null подставляется 0
    val lengths = names.map { it?.length ?: 0 }
    println(lengths) // [3, 0, 5, 0, 4]
}
