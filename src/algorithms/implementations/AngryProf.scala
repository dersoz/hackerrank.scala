package algorithms.implementations

/**
  * Created by dogan on 13/05/16.
  */
object AngryProf {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val t = sc.nextInt()
    var i = 0
    while (i < t) {
      val n = sc.nextInt()
      val k = sc.nextInt()
      val a = new Array[Int](n)
      for (a_i <- 0 until n) {
        a(a_i) = sc.nextInt()
      }
      i += 1
      beAngry(a, k)
    }
  }

  def beAngry(a: Array[Int], k: Int): Unit = {
    if (a.count(x => x < 0) + a.count(x => x == 0) < k)
      println("YES")
    else
      println("NO")
  }

}
