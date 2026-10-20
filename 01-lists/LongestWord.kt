package lists.longestword

// Самая длинная строка в списке
fun main() {
    val words = listOf("персик", "ягода", "Крутой-чувак", "бебе", "Супер-мужик")
    var longest = words[0]

    for (word in words) {
        if (word.length > longest.length) {
            longest = word
        }
    }

    println(longest) // Крутой-чувак (при равной длине остаётся первое слово, потому что знак >)
}
