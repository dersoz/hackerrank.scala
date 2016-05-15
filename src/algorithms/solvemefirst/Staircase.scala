package algorithms.solvemefirst

/**
  * Created by dogan on 13/05/16.
  */
object Staircase {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt()
    for (i <- 0 until n) {
      for (j <- i to n - 2)
        print(" ")
      for (k <- n - 2 - i to n - 2)
        print("#")
      println()
    }
  }

}
