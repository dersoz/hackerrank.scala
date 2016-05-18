package algorithms.implementations

/**
  * Created by dogan on 17/05/16.
  */
object ServiceLane {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt()
    val t = sc.nextInt()
    val width = new Array[Int](n)
    for (width_i <- 0 until n) {
      width(width_i) = sc.nextInt()
    }
    var a0 = 0
    while (a0 < t) {
      val i = sc.nextInt()
      val j = sc.nextInt()
      println(vehicle(width, i, j))
      a0 += 1
    }
  }

  def vehicle(w: Array[Int], a: Int, b: Int): Int = {
    w.slice(a, b + 1).min
  }

}
