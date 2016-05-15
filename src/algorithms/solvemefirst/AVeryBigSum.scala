package algorithms.solvemefirst

/**
  * Created by dogan on 12/05/16.
  */
object AVeryBigSum {

  def main(args: Array[String]): Unit = {
    val low = 0
    val highN = 10

    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt()
    if (low > n || n > highN) {
      throw new RuntimeException("Bound check failed")
    }
    val arr = new Array[Long](n)
    for (arr_i <- 0 until n) {
      arr(arr_i) = sc.nextLong()
    }
    print(arr.sum)

  }

}
