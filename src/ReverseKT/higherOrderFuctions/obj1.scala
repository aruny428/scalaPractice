package ReverseKT.higherOrderFuctions

object obj1 extends App {

  def fun1(f: => Int)(implicit request : String): Int = {
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
    implicit val req ="nothing"
     fun1{
      fun2{
        fun3
      }
    }
  }

  println(fun)

}
