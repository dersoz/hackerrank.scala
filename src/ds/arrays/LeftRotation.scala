package ds.arrays

/**
  * Created by dogan on 2016-08-30.
  */
object LeftRotation {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt()
    val r = sc.nextInt()
    val arr = new Array[Int](n)
    for (arr_i <- 0 until n) {
      arr(arr_i) = sc.nextInt()
    }

    rotateLeft(arr, r)

  }

  def rotateLeft[T](a: Array[T], i: Int) = {
    val start = i % a.length
    for (j <- a.indices) {
      print(a((j + start) % a.length) + " ")
    }
  }

}
