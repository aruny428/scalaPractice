package Traits


abstract class pet {
  def speak
  def ownerIsHome=println("owner is home")
}

class bruno extends SmapleClass with Dog {
  //  override def speak: Unit = {
  //    println("woof woof")
  //  }
  override def doNothing: Unit = println("does nothing")



  override def speak(whatToSay: String): Unit = {
    println(whatToSay)
  }

  override def wagtail(enabled: Boolean): Unit = if (enabled) println("wagging tail") else println("doing nothing")


//  override def ownerIsHome: Unit = {
//    //speak
//    wagtail(true)
//  }
}

object Dogmain extends App {
  val d=new bruno
  //d.ownerIsHome
  d.doNothing
}
