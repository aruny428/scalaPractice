package Random

import scala.{:+, ::}
import scala.collection.mutable
import scala.collection.mutable.{ArrayBuffer, ListBuffer}
import java.util.UUID

class device{
  def gg(i:Int)=2*i
}
object Check extends App {

 /* /////////

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

  //////////////////////////////

if(true && true){
  println("experiment")
}

  val lstt : Array[Int]= Array(1,2,3,4,5)

  val result = for(i <- lstt) yield {
     con(i)
  }
  

  def con(i:Int) = i*2

  result.foreach(println)*/


  /////////// checking flatmap with Options

def ensuringToken(f: => Int)(implicit request : String)=
  {
    val requestToken = Option("sampleString")

    val date = Option("23/04/2021")

    date.flatMap { d =>
      println(d)
      val exceptionHash = "sampleString"
      requestToken.filter(exceptionHash.equals).map(_ => f)
    }.getOrElse(404)
  }


  def funtest={
    22
  }

  def fun={
    implicit val request="done"
    ensuringToken{
      funtest
    }
  }

  //println(fun)

  ////////////////////////////////////////////////////

  case class car(price : Int, Model : String)

  def bmw(price :Int,model: String )={
    car(price,model)
  }

  bmw(4, "B6") match {
    case car(price,_) => price match {
      case 4 => println("Done")
      case _ => println("not Done")
    }
  }

  val demo = Seq(true,false,true,true)
  println(demo.headOption.get)

  //////////////////////////////////////////////////////////

  val customerId = UUID.randomUUID()

  println(customerId)


}

object kuch{
  //println("Inside kuch..........")
  val rath=10
}


