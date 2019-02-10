package com.github.sdual.rescala.pis.chap01

object Chap01 extends App {

  println(factorial(30))

  def factorial(x: BigInt): BigInt = {
    if (x == 0) 1 else x * factorial(x - 1)
  }

}
