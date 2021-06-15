package Questions

// Q : Write a Scala program to find the second smallest element from a given array of integers

object secondMin extends App {
  val arr=Array(1,2,3,4,6,7)
  var min=Integer.MAX_VALUE
  var min2=Integer.MAX_VALUE
  for(i<- 0 to arr.length-1) {
    if (arr(i) == min) {
      min2 = min
    } else if (arr(i) < min) {
      min2 = min
    } else if (arr(i) < min2) {}
    min2 = arr(i)
  }


  println(min2)
}
