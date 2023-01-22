import kotlin.random.Random

fun main() {
  val number = Random.nextInt(-5, 5)

  println("Number is: $number")
  println(if (number > 0) 1 else if (number < 0) -1 else 0)
}