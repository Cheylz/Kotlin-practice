package classes.bankaccount

// Банковский счёт с инкапсуляцией: баланс нельзя изменить снаружи напрямую
class BankAccount(balance: Int) {
    var balance: Int = balance
        private set

    fun deposit(amount: Int) {
        if (amount > 0) {
            balance += amount
        } else {
            println("Ошибка: сумма должна быть положительной")
        }
    }

    fun withdraw(amount: Int) {
        if (amount <= 0) {
            println("Ошибка: сумма должна быть положительной")
        } else if (balance >= amount) {
            balance -= amount
        } else {
            println("Недостаточно средств")
        }
    }
}

fun main() {
    val account = BankAccount(100)
    account.deposit(0)       // ошибка
    account.deposit(50)      // 150
    account.withdraw(-10)    // ошибка
    account.withdraw(500)    // недостаточно средств
    account.withdraw(30)     // 120
    println(account.balance) // 120

    // account.balance = 500 // не скомпилируется из-за private set
}
