package lambdas.filtermapbooks

// Фильтрация книг по году и получение списка названий
data class Book(val title: String, val author: String, val year: Int)

fun main() {
    val books = listOf(
        Book("Гордость и предубеждение", "Джейн Остин", 1813),
        Book("Граф Монте-Кристо", "Александр Дюма", 1844),
        Book("Преступление и наказание", "Фёдор Достоевский", 1866),
        Book("Приключения Тома Сойера", "Марк Твен", 1876),
        Book("Портрет Дориана Грея", "Оскар Уайльд", 1890)
    )

    val titles = books.filter { it.year > 1850 }.map { it.title }
    println(titles) // [Преступление и наказание, Приключения Тома Сойера, Портрет Дориана Грея]
}
