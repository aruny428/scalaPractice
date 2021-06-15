package Random

import scala.{:+, ::}
import scala.collection.mutable
import scala.collection.mutable.{ArrayBuffer, ListBuffer}

class device{
  def gg(i:Int)=2*i
}
object Check extends App {

  /////////

  val sample = 1 to 10
  def isEven :PartialFunction[Int, String] = {
    case x if x % 2 == 0 => x+" is even"
  }

  println(isEven(2))

  // the method collect can use isDefinedAt to select which members to collect
  val evenNumbers = sample collect isEven

  println(evenNumbers)

  val isOdd: PartialFunction[Int, String] = {
    case x if x % 2 == 1 => x+" is odd"
  }

  // the method orElse allows chaining another partial function to handle
  // input outside the declared domain
  val numbers = sample map (isEven orElse isOdd)
  println(numbers)






  /////

  def fun (i :Int)(f: => String)={
    s"$i and $f"
  }
  def ft(dd:device,r:Int)={
    println(dd.gg(2)*r+" gfdgdgdfgdg")
  }

  //ft(new device,2)

 // print(kuch.rath)



implicit val instedOfReq="sdasd"

  def ins(str :Int) = " the end"

  def re(dem : Int)(e : Int => String)(implicit request : String)   ={
    println(e(2)+" this is nside re")
  }
  println(re(2)(own => ins(2))+ " printing re here")

  val r = List(Some(1),Some(2),Some(3))





 implicit val d=10
  //implicit val f="ds"


  def gg(i:Int) = 2*i
  def cc(implicit e:Int) =e
  def ee(implicit r: String) = r

  println(cc)
 // println(ee)

  val lst=List("admin","manager","customer")
  println(lst.exists(y => y=="student"))
  println(lst.exists(y => y=="admin"))

  def returnsInt() = 10
  val buf = ArrayBuffer.empty[Int]
  buf += returnsInt()
  buf += 20

  println(buf(1))

  gg (34) match {
    case df => s"getting $df"
    case _ => "nothing"
  }

  case object som
  case object dom

  def rev : PartialFunction[Any,Unit]={
    case som => println(s"got ")
    case dom => println("nothing !!")
  }
  println("the last function is here !")
  //rev
  rev(2)
  rev("sample")
}

object kuch{
  //println("Inside kuch..........")
  val rath=10
}


