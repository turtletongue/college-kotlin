fun main() {
  for (entry in toDict(arrayOf("hello", "apple", "body"))) {
    println(entry)
  }
}

fun <T>toDict(array: Array<T>): Map<Int, T> {
  val dict = mutableMapOf<Int, T>()

  for (i in array.indices) {
    dict[i] = array[i]
  }

  return dict
}