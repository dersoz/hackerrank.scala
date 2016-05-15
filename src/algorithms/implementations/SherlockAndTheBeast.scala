package algorithms.implementations

/**
  * Created by dogan on 14/05/16.
  */
object SherlockAndTheBeast {

  val INVALID_STR = "-1"
  val FIVE = "5"
  val THREE = "3"

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
    if (numOfDigits <= 0)
      return INVALID_STR
    var reminder = numOfDigits
    if (reminder % 15 == 0 || reminder % 3 == 0) {
      return FIVE * reminder
    }
    do {
      reminder -= 5
      if (reminder >= 0 && reminder % 3 == 0) {
        return FIVE * reminder + THREE * (numOfDigits - reminder)
      }
    } while (reminder > 0)
    // Or else ...
    INVALID_STR
  }

}
