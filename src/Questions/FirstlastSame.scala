package Questions

// Q : Write a Scala program to check if the value of the fast or last element of a given array ( length 1 or more)
//     are same or not.

object FirstlastSame extends App {
  val arr=Array(1,2,34,4)
  println(if(arr.length<1) false else arr.head==arr.last)
}
