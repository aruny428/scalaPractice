package Questions

// Q : Write a Scala program to rotate one element left of an given array (length 1 or more) of integers.

object Rotate extends App {

  def rot(array: Array[Int]) : Array[Int]={
    array.tail :+ array.head
  }

  val arr=Array(1,4,5,6,89,3,2)
  rot(arr).foreach(println)
}
