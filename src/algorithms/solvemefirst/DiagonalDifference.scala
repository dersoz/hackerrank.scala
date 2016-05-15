package algorithms.solvemefirst

import scala.math.{max, min}

/**
  * Created by dogan on 12/05/16.
  */
object DiagonalDifference {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt()
    val a = Array.ofDim[Int](n, n)
    var sumFirstDiagonal = 0
    var sumSecondDiagonal = 0
    for (a_i <- 0 until n) {
      for (a_j <- 0 until n) {
        a(a_i)(a_j) = sc.nextInt()
        if (a_j == a_i) // First diagonal
          sumFirstDiagonal += a(a_i)(a_j)
        if ((a_j + a_i) == n - 1) // Second diagonal
          sumSecondDiagonal += a(a_i)(a_j)
      }
    }
    print(max(sumFirstDiagonal, sumSecondDiagonal) - min(sumFirstDiagonal, sumSecondDiagonal))
  }

}
