package algorithms.implementations

/**
  * Created by dogan on 20/05/16.
  */
object ChocolateFeast {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val t = sc.nextInt()
    var a0 = 0
    while (a0 < t) {
      val n = sc.nextInt()
      val c = sc.nextInt()
      val m = sc.nextInt()
      a0 += 1
      println(chocoRec(n, c, m))
    }
  }

  def chocoRec(n: Int, c: Int, m: Int): Int = {
    def recChoc(init: Int, m: Int, wrappers: Int): Int = {
      if (wrappers < m)
        return init
      val returnFromWrappers: Int = (wrappers - wrappers % m) / m
      recChoc(init + returnFromWrappers, m, returnFromWrappers + wrappers % m)
    }
    val initialChocolates = (n - n % c) / c
    recChoc(initialChocolates, m, initialChocolates)
  }

}
