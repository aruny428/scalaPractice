package Inheritence

abstract class polygon {
  def area: Double
  def area2: Float = 2.0f
  var address :Option[String]= None
}

  object polygon {

    def main(args: Array[String]): Unit = {
      val rect = new rectangle(50, 20)
      val tri = new triangle(50, 20)
      printArea(tri)
      printArea(rect)
    }

    def printArea(p: polygon) : Unit = {
      println(p.area)
    }

  }

