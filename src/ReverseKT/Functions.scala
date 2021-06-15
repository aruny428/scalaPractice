package ReverseKT

object Functions extends App {
  /* def fun(a:Int , b:Int )  ={      //normal function
   println(a + b)
  }
  fun(2,3)*/
//===============================================================================================================
  /*//Anonymous Function
  val add = (a:Int,b:Int) => a+b   //anonymous function
  println(add(2,3))              //calling fully applied functions

  //Partially applied functions

  val f=add(2,_:Int)

  println(f(3))*/
//=============================================================================================================

 /* //Higher Order function

  //def opr (a: Int,b: Int, f: (Int,Int)=>Int): Int = f(a,b)
  def opr (a: Int,b: Int, c : Int, f: (Int,Int)=>Int): Int = f(f(a,b),c)

  //val res=opr(1,2,3,(a,b) => a * b)

  val res=opr(1,2,3, _ + _)        //"_" is called wildcard
  println(res)
*/
//===============================================================================================================

 /* //Closures

  var temp=20

  def add(x : Int) = x+temp

  temp=30

  println(add(1))
  println(add(2))
*/
//==============================================================================================================

  //Function currying

  //def add(a: Int) = (b: Int) => a + b
  def add(a: Int) (b: Int) = a + b


  val fun2=(a:Int) => a*2

  //val sum = add(29)        // Partially Applied function
  //val sum= add(29)(3)
  val sum = add(29)_
  //println(sum)
  println(sum(3))

}
