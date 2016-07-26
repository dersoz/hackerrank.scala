package fp.recursion

/**
  * Created by dogan on 21/05/16.
  */
object Fibonacci {

  def fib(n: Int): BigInt = {
    def fibo(t2: BigInt, t1: BigInt, n: Int): BigInt = {
      if (n == 1)
        return t1
      if (n == 2)
        return t2
      fibo(t1 + t2, t2, n - 1)
    }
    fibo(1, 0, n)
  }

  def main(a: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt()
    println(fib(n))
  }

}
