package inheritance.animalsopenclass

// open class: потомки получают поля и код родителя и могут переопределять open-методы
open class Animal(val name: String) {
    open fun sound() = "..."
    open fun legs() = 4
    fun introduce() = "Я $name"
}

class Dog(name: String) : Animal(name) {
    override fun sound() = "Гав"
}

class Fish(name: String) : Animal(name) {
    override fun legs() = 0
}

class Cat(name: String) : Animal(name) {
    override fun sound() = "Мяу"
}

fun main() {
    val animals = listOf(Dog("Рекс"), Fish("Немо"), Cat("Барсик"))
    for (a in animals) {
        println("${a.introduce()}, говорю: ${a.sound()}, у меня ${a.legs()} лап")
    }
}
