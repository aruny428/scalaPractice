package ReverseKT

object case_class extends App {

  case class sms(number: Int, msg : String)
  case class email(mail: String , subject : String)

  val sms1=sms(1,"good")
  val sms2=sms(1,"good")


  println(sms1.equals(sms2))
  println(sms1.hashCode())

  val getsms=sms1

  getsms match {
    case sms(1,"good") => println("msg 1 ")
    case sms(2,"Nice") => println("msg 2 ")
    case _=> println("default")
  }
}
