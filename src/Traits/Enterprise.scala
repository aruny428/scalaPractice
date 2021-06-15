package Traits


trait warship{
  this: {def ArmDef(WeaponName : String) : Boolean} =>
}


class Enterprise extends warship {
   def ArmDef(WeaponName : String) : Boolean ={
     if(WeaponName == "machine gun"){
       true
     }else {
       false
     }
   }
}

class atul

trait Angry{
  println("don't come near me !")
}

object Enterprise extends App{
  val dd=new Enterprise
  println(dd.ArmDef("machine gun"))

//  val num=(i:Int) => {i%2==0}
//  println(num(3))


//  val f: Int => Boolean = i => { i % 2 == 0 }
//  println(f(2))



//  val hulk=new atul with Angry

  val modFilter=(i:Int)=>i%2==0
  val list=List.range(1,10)
  println(list.filter(modFilter))

  val c=scala.math.cos(_)
  println(c(0))
}
