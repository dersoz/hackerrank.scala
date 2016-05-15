package fp

import java.util.Scanner

/**
  * Created by dogan on 13/05/16.
  */
object HelloWorld {

  def main(args: Array[String]): Unit = {
    f()
    nTimesHello()
  }

  def nTimesHello(): Unit = {
    for (i <- 1 to new Scanner(System.in).nextInt())
      println("Hello World")
  }

  def f(): Unit = println("Hello World")
}
