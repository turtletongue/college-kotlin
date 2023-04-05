import java.lang.NumberFormatException
import kotlin.math.pow

class Cylinder() {
  private var _baseRadius = 0.0
  private var _height = 0.0

  constructor(_baseRadius: Double, _height: Double) : this() {
    this.baseRadius = _baseRadius
    this.height = _height
  }

  var baseRadius: Double
    get() = this._baseRadius
    set(value) {
      this._baseRadius = if (value >= 0) value else 0.0
    }

  var height: Double
    get() = this._height
    set(value) {
      this._height = if (value >= 0) value else 0.0
    }

  val volume: Double
    get() = Math.PI * this.baseRadius.pow(2) * this.height
}

fun main() {
  println("Welcome to Cylinder App");
  println("Here are available commands:")
  println("create <base radius> <height> -- create new cylinder")
  println("set height <new height> -- set cylinder height")
  println("get height -- get cylinder height")
  println("set baseRadius <new base radius> -- set base radius")
  println("get baseRadius -- get cylinder base radius")
  println("get volume -- get cylinder volume")
  println("finish -- finish program")

  var cylinder: Cylinder? = null

  while (true) {
    val commandArgs = readLine()!!.split(' ')

    if (commandArgs.isEmpty()) {
      continue
    }

    val command = commandArgs[0]

    if (command == "finish") {
      println("Finishing...")
      break
    }

    if (command == "create") {
      if (commandArgs.size < 3) {
        continue
      }

      try {
        cylinder = Cylinder(commandArgs[1].toDouble(), commandArgs[2].toDouble())
        println("New cylinder created successfully!")
      } catch (exception: NumberFormatException) {
        println("<base radius> and <height> must be numbers")
      }
    }

    if (command == "set") {
      if (commandArgs.size < 3 || cylinder == null) {
        continue
      }

      val property = commandArgs[1]

      try {
        val updatedValue = commandArgs[2].toDouble()

        if (property == "height") {
          cylinder.height = updatedValue
        }

        if (property == "baseRadius") {
          cylinder.baseRadius = updatedValue
        }

        println("Property $property updated successfully!")
      } catch (exception: NumberFormatException) {
        println("$property must be a number")
      }
    }

    if (command == "get") {
      if (commandArgs.size < 2 || cylinder == null) {
        continue
      }

      val property = commandArgs[1]

      if (property == "height") {
        println(cylinder.height)
      }

      if (property == "baseRadius") {
        println(cylinder.baseRadius)
      }

      if (property == "volume") {
        println(cylinder.volume)
      }
    }
  }
}