package fp.recursion

/**
  * Created by dogan on 21/05/16.
  */
object PascalTriangle {

  def factorial(n: Int): BigInt = {
    if (n == 1)
      return 1
    n * factorial(n - 1)
  }

  def pascalValue(n: Int, r: Int): BigInt = {
    factorial(n) / (factorial(r) * factorial(n - r))
  }

  def main(a: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt()
    println(factorial(5))
  }

}
