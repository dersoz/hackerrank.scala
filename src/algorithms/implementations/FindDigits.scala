package algorithms.implementations

import scala.collection.mutable.ListBuffer

/**
  * Created by dogan on 17/05/16.
  */
object FindDigits {

  def digits(n: Int, l: ListBuffer[Int]): List[Int] = {
    if (n < 10) {
      l += n
      return l.toList.reverse
    }
    l += n % 10
    digits((n - n % 10) / 10, l)
  }

  def divides(n: Int, i: Int): Boolean = {
    if (i == 0)
      false
    else
      n % i == 0
  }

  def numOfDividingDigits(n: Int): Int = {
    digits(n, ListBuffer[Int]()).count(x => divides(n, x))
  }

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val t = sc.nextInt()
    var a0 = 0
    while (a0 < t) {
      val n = sc.nextInt()
      println(numOfDividingDigits(n))
      a0 += 1
    }
  }

}
