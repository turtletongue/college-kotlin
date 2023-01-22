import kotlin.random.Random

fun main() {
  val charCode = Random.nextInt(32, 123)
  val char = charCode.toChar()

  println(char)

  val message = when {
    char.isDigit() -> "Это цифра"
    char.isLetter() -> "Это буква"
    else -> "Это не цифра, и не буква"
  }

  println(message)
}