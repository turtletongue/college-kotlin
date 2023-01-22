fun main() {
  var isCalculationSucceded = false

  while (!isCalculationSucceded) {
    val a = readLine()!!
    val b = readLine()!!
    val c: Int

    try {
      c = a.toInt() / b.toInt()
      isCalculationSucceded = true
      println(c)
    }
    catch (e: ArithmeticException) {
      println("Делить на ноль нельзя")
    }
    catch (e: NumberFormatException) {
      println("Надо вводить только числа")
    }
  }
}