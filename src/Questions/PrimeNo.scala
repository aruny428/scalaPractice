package Questions


object PrimeNo extends App {

  def getPrime(start :Int,end: Int): Unit ={
    if(start==end ) {
      return
    }
    if(start >1 && end >1) {
      val isPrime = (2 to Math.sqrt(start).toInt).forall(start % _ != 0)
      if (isPrime) print(start + " ")
    }
    getPrime(start+1,end)
  }

  getPrime(0,10)
}
