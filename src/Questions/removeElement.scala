package Questions

import scala.collection.mutable.ArrayBuffer

object removeElement extends App {
  def remove(arr: ArrayBuffer[Int],index:Int) : ArrayBuffer[Int]={
    arr.remove(index)
    arr
  }

  val arr=ArrayBuffer(1,2,3,4,5)
  remove(arr,2).foreach(println)

}
