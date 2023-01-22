fun main() {
  val dictionary = mutableMapOf<String, String>()

  println("Вводите строки в формате ключ значение. Для выхода из ввода введите stop.")

  while (true) {
    val entry = readLine()!!

    if (entry == "stop") {
      break
    }

    val entryItems = entry.split(" ")

    if (entryItems.size != 2) {
      continue
    }

    dictionary[entryItems[0]] = entryItems[1]
  }

  for (entry in dictionary) {
    println(entry)
  }
}