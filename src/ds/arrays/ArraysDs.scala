package ds.arrays

/**
  * Created by dogan on 29/08/16.
  */
object ArraysDs {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt()
    val arr = new Array[Int](n)
    for (arr_i <- 0 until n) {
      arr(arr_i) = sc.nextInt()
    }

    printArray(arr)
  }

  def printArray[T](a: Array[T]): Unit = {
    a.reverse.foreach(x => print(x + " "))
  }

}
