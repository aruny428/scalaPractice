package ReverseKT

import scala.io.Source
import scala.util.{Try,Success,Failure}

object TryInScala extends App {

    def readTextFile(filename: String): Try[List[String]] = {
      Try(Source.fromFile(filename).getLines.toList)
    }

    val filename = "C:/Users/gsc-30710/Desktop/files/topics.txt"
    readTextFile(filename) match {
      case Success(lines) => lines.foreach(println)
      case Failure(f) => println(f)
    }


}
