package ReverseKT.traits

class Triangle extends shape with property {

  override def color(clr: String): String = {
    clr
  }

  override def area(side: Int): Int = 4*side

}

object Triangle extends App{
  val t1= new Triangle
  println(t1.size(2))
  println(t1.area(3))
  println(t1.color("green"))

}

