package Questions

import scala.collection.mutable.ArrayBuffer

// Q : Write a Scala program to find the number of even integers in a given array of integers.

object evenOdd extends App {
  def NumberOfEve (arr: Array[Int], index : Int,temp:ArrayBuffer[Int]) : Int ={
    if(arr.length==index) return temp.length
    if(arr(index)%2==0){
      temp.append(1)
    }

    NumberOfEve(arr,index+1,temp)
  }

  val arr=Array(1,2,3,5,6)
  val temp=ArrayBuffer[Int]()
  println(NumberOfEve(arr,0,temp))


}
