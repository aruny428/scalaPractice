package Inheritence

class rectangle(val w: Double, h : Double) extends polygon {
  override def area: Double = w*h
}
