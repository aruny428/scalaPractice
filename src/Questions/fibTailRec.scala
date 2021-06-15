package Questions

object fibTailRec extends App {

  def fib(n: Int,a: Int=0,b: Int=1): Int ={

    if(n==0) {
      return a
    }
    if(n==1) {
      return b
    }

    fib(n-1,b,a+b)
  }

  println(fib(4))

}
