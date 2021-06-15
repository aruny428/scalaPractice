class game( var i : Int, var j : Int, var k :Int){
  def this(){
    this(20,40,60)
  }
  def this(i: Int){
    this()
    this.i=i
  }
  def this(num :Int, j: Int)
    {
      this()
      i=num
      this.j=j
    }


  println(i)
}

case class pizza(var size : Int, pType : String){
//  def apply()=new pizza(10,"whyThis")
}

class burg private (var i : Int) //singleton class

// companion object for single class
object  burg{
  val Burg=new burg(10)
  def getIns =Burg
}


object Questions {
def main(args :Array[String]): Unit={
  val n=new game(1,2)
  println(s"${n.i} ----- ${n.j} ------ ${n.k}")

  val x=pizza(1,"corn")
  x.size=10
  println(s"${x.pType} is of size ${x.size} cms")

  val xx=burg.getIns
  println(xx.i)





//  for(i<- 1 to 3){
//    for(j<- 1 to i){
//      print("*" + j)
//    }
//    println()
//   }
}

}



