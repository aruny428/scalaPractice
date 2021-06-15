package ReverseKT

object Options extends App {

  val temp : Option[Any]= Some(10)

  println(temp.getOrElse("Got none"))                    // ways to handle None

  println(if(temp.isDefined) temp.get else "Got None")

  temp match {
    case Some(value)  => println(value)
    case None => println("not valid")
  }

  val lst = List('a','B','c','d')

  val temp1 = lst.find(_ == 'W')

  temp1 match {
    case Some(value) => println(value)
    case None => println("No such element found")
  }
}
