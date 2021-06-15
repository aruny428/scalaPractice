package Questions

object notSame extends App {
  def Nsame(lst: List[Int]): List[Int] = {
    lst.distinct
  }

  val lst = List(1, 2, 3, 4, 5, 5, 5, 5)
  Nsame(lst).foreach(println)


}
