package algorithms.implementations

/**
  * Created by dogan on 15/05/16.
  */
object UtopianTree {

  def grow(h: Int, cycles: Int): Int = {
    if (h == 0 || cycles == 0)
      return h
    if (cycles == 1)
      return h * 2
    if (cycles == 2)
      return (h * 2) + 1
    grow((h * 2) + 1, cycles - 2)
  }

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val t = sc.nextInt() // Num of cases
    var a0 = 0
    while (a0 < t) {
      println(grow(1, sc.nextInt()))
      a0 += 1
    }
  }

}
