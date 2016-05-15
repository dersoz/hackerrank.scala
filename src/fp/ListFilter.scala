package fp

import scala.collection.mutable.ListBuffer

/**
  * Created by dogan on 13/05/16.
  */
object ListFilter {

  def main(s: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt()
    var listBuf = new ListBuffer[Int]
    for (i <- 0 until n)
      listBuf += sc.nextInt()
    println(f(n, listBuf.toList))
  }

  def f(delim: Int, arr: List[Int]): List[Int] = {
    arr.filter(x => x < delim)
  }

}
