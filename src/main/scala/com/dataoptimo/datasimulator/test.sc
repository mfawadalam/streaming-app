package com.dataoptimo.datasimulator

object test {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val z = Map((1,2),(10,3))                       //> z  : scala.collection.immutable.Map[Int,Int] = Map(1 -> 2, 10 -> 3)
  z.get(10)                                       //> res0: Option[Int] = Some(3)
}