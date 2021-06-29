package ReverseKT.higherOrderFuctions


object obj2 extends App{

  def checkCustomer(customerId : String )(f : => Int)(implicit request: Request)={
    if(customerId.equals("1002C")){
      f
    }
    else {
      println("Customer does not exist in our record")
      404+"not found"
    }
  }

  def withIdNumber(f : Int => Int) (implicit request: Request) ={

    getId(request.role).map(f).getOrElse{
      println("Could not get role !!")
      404
    }

  }

  def rent(id :Int)={
    id*100
  }

   def getId(role:String)={
     role match {
      case "manager" => Some(10)
      case "Admin" => Some(20)
      case "customer" => Some(30)
      case _ => None
    }
  }

  val DemoCustomerId = "1002C"

  // main function to run
  def fun()={
    implicit val DemoRequest = Request("alpha","manager")
    checkCustomer(DemoCustomerId){
      withIdNumber{ id =>
        rent(id)
      }
    }
  }

  println(fun())



}

case class Request(name :String,role : String)
