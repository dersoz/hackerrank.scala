package algorithms.solvemefirst

/**
  * Created by dogan on 12/05/16.
  */
object PlusMinus {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt()
    val arr = new Array[Int](n)
    for (arr_i <- 0 until n) {
      arr(arr_i) = sc.nextInt()
    }
    println(fraction(arr, x => x > 0))
    println(fraction(arr, x => x < 0))
    println(fraction(arr, x => x == 0))
  }

  def fraction(a: Array[Int], p: (Int) => Boolean): Double = a.count(p).toDouble / a.length

}
