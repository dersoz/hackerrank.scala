package ds.arrays

/**
  * Created by dogan on 29/08/16.
  */
object HourglassSum2DArray {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val arr = Array.ofDim[Int](6, 6)
    for (arr_i <- 0 until 6) {
      for (arr_j <- 0 until 6) {
        arr(arr_i)(arr_j) = sc.nextInt()
      }
    }
    println(maxHourglassSum(arr))
  }


  def maxHourglassSum(a: Array[Array[Int]]): Int = {
    if (a.length < 3)
      throw new RuntimeException("Outer size must be bigger than 3")
    if (a(0).length < 3)
      throw new RuntimeException("Inner size must be bigger than 3")

    val i = a.length - 3 + 1
    val j = a(0).length - 3 + 1

    var maxSum = Int.MinValue
    var immediateSum = Int.MinValue
    for (y <- 0 until i) {
      for (x <- 0 until j) {
        immediateSum = hourglassSum(a, y, x)
        if (maxSum < immediateSum)
          maxSum = immediateSum
      }
    }
    maxSum
  }

  def hourglassSum(a: Array[Array[Int]], y: Int, x: Int): Int = {
    a(y)(x) +
      a(y)(x + 1) +
      a(y)(x + 2) +
      a(y + 1)(x + 1) +
      a(y + 2)(x) +
      a(y + 2)(x + 1) +
      a(y + 2)(x + 2)
  }

}
