package ds.arrays

import java.util.Scanner

/**
  * Created by dogan on 2016-09-06.
  */
object SparseArrays {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val sNum = sc.nextLine().trim.toInt
    val strings = readLines(sc, sNum)
    val qNum = sc.nextLine().trim.toInt
    val queries = readLines(sc, qNum)
    queries.foreach(q => println(count(q, strings)))
  }

  def readLines(sc: Scanner, n: Int): Seq[String] =
    for (arr_i <- 0 until n) yield sc.nextLine()

  def count(q: String, strings: Seq[String]): Int =
    (for (s <- strings; if s == q) yield 1).sum

}

object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextLine().toInt
    val mapS = (1 to n).foldLeft(Map.empty[String, Int]) {
      case (acc, _) =>
        val s = sc.nextLine
        val count = acc.getOrElse(s, 0)
        acc + (s -> (count + 1))
    }

    val m = sc.nextLine().toInt
    (1 to m).foreach { _ =>
      val s = sc.nextLine
      println(mapS.getOrElse(s, 0))
    }
  }
}