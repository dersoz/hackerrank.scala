package algorithms.implementations

/**
  * Created by dogan on 17/05/16.
  */
object SherlockAndSquares {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val t = sc.nextInt()
    var a0 = 0
    while (a0 < t) {
      val a = sc.nextInt()
      val b = sc.nextInt()
      println(findSquares(a, b))
      a0 += 1
    }
  }

  def findSquares(a: Int, b: Int) = {
    val low = (math.sqrt(a.toDouble) - 1).toInt
    val high = (math.sqrt(b.toDouble) + 1).toInt
    (low until high).count(x => x * x >= a && x * x <= b)
  }

}
