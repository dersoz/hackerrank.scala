package algorithms.implementations

/**
  * Created by dogan on 21/05/16.
  */
object FibonacciModified {

  def fiboModified(t2: BigInt, t1: BigInt, n: Int): BigInt = {
    if (n == 1)
      return t1
    if (n == 2)
      return t2
    fiboModified(t2 * t2 + t1, t2, n - 1)
  }

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val n = sc.nextInt()
    println(fiboModified(b, a, n))
  }

}
