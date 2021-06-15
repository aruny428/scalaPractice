package Collections

import scala.collection.mutable.ArrayBuffer

object Sequential extends App{

  //vectors

  var a=Vector(1,2,3,4)
//  for(i <- a if i%2==0)  println(i)
   a=a ++ Vector(5,6,7,8)

  val i=IndexedSeq(1,2,3,3)
  //println(i.getClass)

  // ArrayBuffer


  val arr=ArrayBuffer(1,2,23)
  arr(0)=10
  //println(arr.map(i => i* 10))
  arr +=2
  arr ++=List.range(5,9)
 println(arr -= (5,6))
  arr.foreach(print)

  val days=Array("Monday","Tuesday","Wednesday","Thursday","friday","Saturday","Sunday")
  days.zipWithIndex.foreach{
    case(day,count) => println(s"$count is $day")
  }

}
