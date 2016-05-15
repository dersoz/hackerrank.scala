package algorithms.implementations

/**
  * Created by dogan on 14/05/16.
  */
object SherlockAndTheBeast {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val t = sc.nextInt()
    var a0 = 0
    while (a0 < t) {
      val n = sc.nextInt()
      a0 += 1
      val number: String = largestDecentNumber(n)
      println(number)
    }
  }

  def largestDecentNumber(numOfDigits: Int): String = {
    var reminder = numOfDigits
    var iter = 1
    if (reminder % 15 == 0) "5" * reminder
    else if (reminder % 5 == 0) "3" * reminder
    else if (reminder % 3 == 0) "5" * reminder
    else {
      do {
        reminder -= 5
        if (reminder % 3 == 0) {
          return "5" * reminder + "3" * iter * 3
        }
        iter += 1
      } while (reminder > 0)
      // Or else ...
      "-1"
    }
  }

}
