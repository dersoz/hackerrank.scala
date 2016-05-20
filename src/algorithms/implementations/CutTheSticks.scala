package algorithms.implementations

/**
  * Created by dogan on 20/05/16.
  */
object CutTheSticks {

  def cut(a: Array[Int], n: Int): Array[Int] = {
    if (n == 0 || a.length == 0)
      return a
    println(a.length)
    val min: Int = a.min
    cut(a.map(x => x - min).filter(y => y > 0), n - 1)
  }

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    val n = sc.nextInt()
    val arr = new Array[Int](n)
    for (arr_i <- 0 until n) {
      arr(arr_i) = sc.nextInt()
    }
    cut(arr, n)
  }

}
