package ReverseKT

object PatternMatching extends App {

  val inputDay = "sundaysdss"

  val result=inputDay match {
    case "sunday" => "Weekend"
    case "saturday" => "still a weekend"
    //case weekday => s"today is $weekday"
    case _=> "weekday"
  }

  /*val result=inputDay match {
    case "sunday" | "saturday" => "weekend"  //to combine
    //case someDay if someDay=="sunday" || someDay=="saturday" => "weekend" //using guards
    case _=> "weekday"
  }*/

  println(result)

//  can do pattern matching as well (instanceOf)
  def area(radius : Any) : Double ={
    radius match {
      case i: Int => Math.PI * i * i
      case s: String => Math.PI * s.toInt * s.toInt
    }
  }

  println(area(2))
  println(area("2"))


  //case class with pattern matching
  case class st(name : String, age : Int)

  val amit=st("amit",20)
  val akash=st("akash",30)

  val person=amit

  person  match {
    case st("amit",20) => println("hi amit !!")
    case st("akash",30) => println("hello akash !!")
    case _ => println(s"are you  ?!!")
  }

}
