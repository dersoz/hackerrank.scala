package fp

import scala.collection.mutable.ListBuffer

/**
  * Created by dogan on 13/05/16.
  */
object ListReplication {

  def main(a: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt()
    var listBuf = new ListBuffer[Int]
    for (i <- 0 until n)
      listBuf += sc.nextInt()
    println(f(n, listBuf.toList))
  }

  def f(num: Int, arr: List[Int]): List[Int] = {
    def replica(n: Int, arr_i: Int): List[Int] = {
      var listBuf = new ListBuffer[Int]
      for (i <- 1 to n)
        listBuf += arr_i
      listBuf.toList
    }
    arr.flatMap(x => replica(num, x))
  }

}
