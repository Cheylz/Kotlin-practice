package inheritance.animalsinterface

// Интерфейс: контракт «что умеет объект», а класс решает, как именно
interface Animal {
    fun sound(): String
    fun name(): String
}

class Dog : Animal {
    override fun sound() = "Гав"
    override fun name() = "Собака"
}

class Cat : Animal {
    override fun sound() = "Мяу"
    override fun name() = "Кошка"
}

class Cow : Animal {
    override fun sound() = "Му"
    override fun name() = "Корова"
}

fun main() {
    val animals: List<Animal> = listOf(Dog(), Cat(), Dog(), Cow())
    for (animal in animals) {
        println("${animal.name()}: ${animal.sound()}")
    }
}
