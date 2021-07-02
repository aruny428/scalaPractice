package ReverseKT

import java.lang.Thread.sleep
import java.util.concurrent.TimeoutException
import scala.concurrent.{Await, Future, TimeoutException}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.DurationInt
import scala.util.{Failure, Success}
import scala.util.Random

object SyncAsyncExample extends App {

  /////////////////////////////////////////////////////////////////////

  /*def blockingFunction(arg: Int): Int = {
    Thread.sleep(10000)
    arg + 42
  }

  //println(blockingFunction(3))
  val theMeaningOfLife = 42
  //println(theMeaningOfLife)

  def asyncBlockingFunction(arg: Int): Future[Int] = Future{
    Thread.sleep(10000)
    arg + 42
  }

   asyncBlockingFunction(3).onComplete {
    case Success(value) => value
    case Failure(e) => e
  }
  println(theMeaningOfLife)

  //println("after future ")*/

  /////////////////////////////////////////////////////////////////////////

 /* // used by 'time' method
  implicit val baseTime = System.currentTimeMillis
  //println(baseTime)
  // 2 - create a Future
  val f = Future {
    sleep(2000)
    1 + 1
  }
  // 3 - this is blocking (blocking is bad)

try {
  val result = Await.result(f, 1.second)
  println(result)
}
  catch {
    case e : TimeoutException =>
      println(e)

    case e : Throwable =>
      println(e)
  }

  sleep(1000)*/


  /////////////////////////////////////////////////////////////////////////

    println("starting calculation ...")
    val f = Future {
      sleep(Random.nextInt(500))
      42
    }
    println("before onComplete")
    f.onComplete {
      case Success(value) => println(s"Got the callback, meaning = $value")
      case Failure(e) => e.printStackTrace
    }
    // do the rest of your work
    println("A ..."); sleep(100)
    println("B ..."); sleep(100)
    println("C ..."); sleep(100)
    println("D ..."); sleep(100)
    println("E ..."); sleep(100)
    println("F ..."); sleep(100)
    sleep(2000)

  ////////////////////////////////////////////////////////////////////////////////////////////////////

  //using OnSuccess and Failure

  ///////////////////////////////////////////////////////////////////////////////////////////////////////

  //creating the Future[T] method

 /* //implicit val baseTime = System.currentTimeMillis
  def longRunningComputation(i: Int): Future[Int] = Future {
    sleep(100)
    i + 1
  }
  // this does not block
  longRunningComputation(11).onComplete {
    case Success(result) => println(s"result = $result")
    case Failure(e) => e.printStackTrace
  }
  // keep the jvm from shutting down
  sleep(1000)*/

  ///////////////////////////////////////////////////////////////////////////////////////////////////



}
