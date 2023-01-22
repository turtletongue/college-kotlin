fun main() {
  print("Введите первое число: ")
  val a = readLine()?.toDouble()

  print("Введите операцию (+, -, *, /): ")
  val operation = readLine()

  print("Введите второе число: ")
  val b = readLine()?.toDouble()

  if (a == null || b == null) {
    return
  }

  val result = when (operation) {
    "+" -> a + b
    "-" -> a - b
    "*" -> a * b
    "/" -> {
      if (b == 0.0) {
        println("Ошибка деления на ноль")
        return
      }

      a / b
    }
    else -> {
      println("Некорректная операция: $operation")
      return
    }
  }

  println("Результат: $result")
}