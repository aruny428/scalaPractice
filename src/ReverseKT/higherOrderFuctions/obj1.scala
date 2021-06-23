package ReverseKT.higherOrderFuctions

object obj1 extends App {

  def fun1(f : => Int)(implicit request : String)= {
    if(request.equals("nothing")) {
      f
    }
    else{
      404
    }
  }

  def fun2(f : => Int)={
    f
  }

  def fun3 ={
    3
  }


  def fun = {
    implicit val req ="nothing much"
     fun1{
      fun2{
        println("reach here")
        fun3
      }
    }
  }

  def funn1 ={
    Option(2)
  }

  println(fun)

  //println(funn1.map(t => t*2).getOrElse("got nothing"))


}
