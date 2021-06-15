package Questions

// Q : Write a Scala program to find the maximum value from first,
//     middle and last values of a given array of integers. Array length should be 1 and more and odd.

object max extends App{
  def maxElement (arr : Array[Int])={
    if(arr.length==1) arr(0)
    Array(arr(0),arr(arr.length/2),arr(arr.length-1)).max
  }

  val arr=Array(1,2,3,4,5,6)
  println(maxElement(arr))

}
