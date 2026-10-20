package classes.booksclassvsdataclass

// Обычный class и data class: сравнение и вывод
class Book(val title: String, val author: String, val year: Int)

data class BookData(val title: String, val author: String, val year: Int)

fun main() {
    val book1 = Book("Война и мир", "Лев Толстой", 1869)
    val book2 = Book("Капитанская дочка", "Александр Пушкин", 1836)
    val book3 = Book("Преступление и наказание", "Фёдор Достоевский", 1866)

    val books = listOf(book1, book2, book3)
    for (book in books) {
        println("${book.title}, ${book.author}, ${book.year}")
    }

    // Сравнение двух одинаковых по данным объектов
    val a = Book("Война и мир", "Лев Толстой", 1869)
    val b = Book("Война и мир", "Лев Толстой", 1869)
    println(a == b) // false: разные объекты в памяти

    val c = BookData("Война и мир", "Лев Толстой", 1869)
    val d = BookData("Война и мир", "Лев Толстой", 1869)
    println(c == d) // true: data class сравнивает содержимое полей

    println(a) // Book@...
    println(c) // BookData(title=Война и мир, author=Лев Толстой, year=1869)

    // copy: новая копия с изменённым полем
    val e = c.copy(year = 2000)
    println(c) // year=1869
    println(e) // year=2000
}
