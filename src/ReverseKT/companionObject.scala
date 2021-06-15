package ReverseKT

class companionObject {
    val temp=10

  private def display() = println("value in temp is "+temp)

}
object companionObject {
    val obj= new companionObject
    val obTemp=obj.temp
  private val fa=10
    obj.display()
}

object main{
  def main(args: Array[String]): Unit = {
   // println(companionObject.obTemp)
    val obj1=new companionObject
    println(obj1.temp)
  }
}

