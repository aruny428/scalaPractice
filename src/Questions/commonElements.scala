package Questions

// Q : Write a Scala program to find the common elements between two arrays of integers

import scala.annotation.tailrec
import scala.collection.mutable.ArrayBuffer

object commonElements extends App {

  @tailrec
  def comElement(arr1: Array[Int],arr2: Array[Int],i: Int,j:Int,result :ArrayBuffer[Int]) : ArrayBuffer[Int]={

    if(arr1.length==i || arr2.length==j) return result

    if(arr1(i)==arr2(j)){
      result.append(arr1(i))
    }

    comElement(arr1,arr2,i+1,j+1,result)

  }

  val arr1=Array(1,2,3,4,5,8,10)
  val arr2=Array(1,24,3,44,5,8,10)
  val result=ArrayBuffer[Int]()

  comElement(arr1,arr2,0,0,result).foreach(println)

}
