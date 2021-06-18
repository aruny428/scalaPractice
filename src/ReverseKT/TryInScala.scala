package ReverseKT

import scala.io.Source
import scala.util.{Try,Success,Failure}

object TryInScala extends App {

    def readTextFile(filename: String): Try[Seq[Customer]] = {
      Try(Source.fromFile(filename).getLines.toSeq.map { l =>
        val str = l.split(",",3)
        Customer(str(0),str(1),str(2))
      })
    }

    val filename = "C:/Users/gsc-30710/Desktop/files/topics.txt"
    readTextFile(filename) match {
      case Success(lines) => lines.foreach(l =>
        println(l.deviceType)
      )
      case Failure(f) => println(f)
    }


}

case class Customer(customerId: String, deviceId: String, deviceType: String)
