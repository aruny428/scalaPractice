package Questions

import scala.annotation.tailrec

object Brackets extends App {

  @tailrec
  def d(word : String,index: Int,res:Array[String]) : Array[String] ={
    if(index==word.length) return res

//    val temp=word.charAt(index)
//    if(word.contains(temp){
//      res(index)=")"
//    }else{
//      res(index)="("
//    }
    d(word,index+1,res)

  }

  val s="abcde"
  val arr=Array("sd","sa","sd","sd","sd")
  d(s,0,arr).foreach(print)

}
