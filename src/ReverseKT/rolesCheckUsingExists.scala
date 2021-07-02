package ReverseKT

import java.util.concurrent.TimeoutException
import scala.concurrent.duration.DurationInt
import scala.concurrent.{Await, Future}

sealed abstract class Role {
  val role: String
}

case object AdminRole extends Role {
  override val role = "admin"
}

case object AdminPortalRole extends Role {
  override val role = "admin_portal"
}

case object DeviceRole extends Role {
  override val role = "device"
}

case object CustomerRole extends Role {
  override val role = "customer"
}

case object ServerRole extends Role {
  override val role = "server"
}

case object DMSRole extends Role {
  override val role = "dms"
}

case object VCSRole extends Role {
  override val role = "vcs"
}

case object ManagerRole extends Role {
  override val role = "manager"
}

object rolesCheckUsingExists extends App {

  def getRole(implicit requestHeader: RequestHeader): Option[String] = {
    Some(requestHeader.role.role)
  }


 /* def withTimeout(f: => Future[String]): String = {
      try {
        Await.result(f, 5.seconds)
      } catch {
        case e: TimeoutException =>
          println("request failed: ", e)
          "ServiceUnavailable"

        case e: Throwable =>
          println("request failed: ", e)
          "BadRequest"
      }
  }*/

def withRoleAsync(roles: Role*)={
  implicit  val adminRoleDemo= RequestHeader(AdminRole)
  //implicit val deviceRoleDemo= RequestHeader(DeviceRole)
  //implicit val managerRoleDemo= RequestHeader(ManagerRole)
    if (getRole.exists(r => roles.exists(_.role == r))) {
      println("got the role : " + getRole.get)
      //Thread.sleep(8000)
      //Future.successful("got the role : "+getRole.get)
    }
    else {
      println("invalid role : " + getRole.get)
      //Future.successful("invalid role : "+ getRole.get)
    }
}

  withRoleAsync(AdminRole,ManagerRole)

}

case class RequestHeader(role: Role)
