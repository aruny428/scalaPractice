package ReverseKT

class test (a :Int){

  def this(a: Int,b : Int)={
    this(a)
    println(a*b)
  }
  def this(a: Int,b:Int,c: Int)={
    this(a,b)      //must invoke one of previous constructors | must be first statement in the method
    println(a+c)
  }


  def display()={
    println(a)
  }
}

object Constructors extends App {

  val testObj = new test(10,20)
  //val testObj = new test(10,20,30)
  testObj.display()

}
