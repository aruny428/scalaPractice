package Questions

object fectTail extends App {
  def fect(n: Int,a:Int=1):Int={
    if(n==1) return a
    return fect(n-1,a*n)
  }

  println(fect(0))

}
