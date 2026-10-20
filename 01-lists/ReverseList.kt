package lists.reverselist

// Разворот списка через цикл, без reversed()
fun main() {
    val words = listOf("персик", "ягода", "Крутой-чувак", "бебе", "Супер-мужик")

    // Способ 1: обход с конца по индексам
    val reversedWords = mutableListOf<String>()
    for (i in words.indices.reversed()) {
        reversedWords.add(words[i])
    }
    println(reversedWords)

    // Способ 2: вставка каждого элемента в начало нового списка
    val reversedWords2 = mutableListOf<String>()
    for (word in words) {
        reversedWords2.add(0, word)
    }
    println(reversedWords2)
}
