import scala.util.control.Breaks._
object Hello {
//  var a="hello"+"math"
//  val myType=a.length
//  //println(myType)
//  //println(a)
//  val result="Aello!".filter(_!='l')
//  //for(c<- "hello") print(c)
//  println(result)
//
//  result.getBytes.foreach(println)
//  var a= "scala".drop(2).take(2).capitalize
//  print(a)

//  val value=
//    """this
//      |is a "multiline"
//      |'statement'
//      |""".stripMargin
//  val value2=" "
//  print(value)

//  var arr= "hello,world,game".split(",").map(_.trim)
//  arr.foreach(println)

//  var arr1="hello, this , is a test".split("\\s+")
//  arr1.foreach(println)

//  val name="Arun"
//  val age=22
//  val weight=66.0
//
//  print(s"$name is ${age+2==22} years old and weighs $weight kgs"+" " +"concatenated")

//  case class Student(name: String ,score :Int )
//  val arun=Student("Arun",100)
//  print(s"${arun.name} is good boy with score ${arun.score}")

//  val name="arun".filter(_ !='r').map(c =>c.toUpper)   //or can use .map(_.toUpper)
//  print(name)

  def main(args : Array[String]){
//    val name="Arun"
//    val age=22
//    println("my name is "+name+" and i am "+ age+" years old")
//    println(s"My name is $name and I am $age years old")
//    println(f"my name is $name%s and i am $age%d years old")
//    println(s"hello \nworld")
//    println(raw"hello \nworld")


    //=================================================================================

//    val a=20
//    var res=""
//    if(a==20) {
//        res="a equals 20"
//    } else {
//        res="a is not equal to 20"
//    }
//    print(res)
//    println()
//
//    print(if(a==20) "a ==20" else "a !=20")

   // ========================================================================================
//loops
//    var a=0
//    while(a<10) {
//        print(a)
//        a+=1
//      }
//    println()
//    print(a)

//  var a=0
//    do{
//      print(a)
//      a +=1
//    }while(a<10)

//    for(i <- 1.to(5) ;j <- 1 to 3;k<- 1 until 3)
//      {
//        println("for i, j and k : "+i+" "+j+" "+ k)
//        //println("for j : "+j)
//      }

//    val lst=List(1,2,3,4,5,6)
//    for(i<-lst)
//      {
//        println(i)
//      }

//    val a=7
//    for(i <- 1 to 10 if(i==a)) println(i)

//    val lst=List(1,2,3,4,5,6)
//    val a=9
//    var res=for(i<- a to 10 if(i%2==0))yield i*i
//    print(res)

    //========================================================================
    //match expressions

//    val age=200
//
//    age match{
//      case 18 => println(age)
//      case 20 => println(age)
//      case 30 => println(age)
//      case who => println("You can not enter this : "+who.toString)
//    }
//
//    val result= age match{
//      case 18 => age
//      case 20 => age
//      case 30 => age
//      case _=> "default"
//    }
//
//    print(s"result is $result")

//    val i=7
//    i match{
//      case 1 | 3 | 5 | 7 | 9 => print("odd")
//      case 2 | 4 | 6 | 8 |10 => print("even")
//    }

//    val a=if(20%2==0) "even" else "odd"
//    print(a)

//    val arr=Array("Apple", "Banana", "Grapes")
//
//    for((i,cnt) <- arr.zipWithIndex )
//      {
//        println(s"$cnt is $i")
//      }
//    breakable{
//      for(i: Int <- 1 to 10){
//        print(i)
//        if(i==7) break
//      }
//    }

    //add(10)
//    val s="peter piper picked a peck of pickled peppers"
//    println(countP(s))
//    println(factorial(5))

//val num=1
//    num match {
//      case x if(x%2==0) => print(s"number is even : $x")
//      case x if(x%2!=0) => print(s"number is odd : $x")
//      case _=> print("not in range")
//    }

//    var v=(i : Int) => i * 10
//    print(v(10))

//    def anything (i :Int,j :Int) = i*j
//
//    val moreAnything =anything(10,_ : Int)
//    print(moreAnything(2))

//    var number =10
//    val fun=(i :Int) => i+number
//
//    print(fun(10))

//   //curried function
//    def fun (x : Int) (y: Int) = x+y
//    val vari=fun(10)_
//    print(vari(20))

    //val myArray : Array[Int][Int] = new Array(5)(4)
//    val myArray1 : Array[String]= new Array(5)
//    val myArray2  = Array(2,3,4,5)
//    for(i<- myArray1) print(i)

    //print(myArray(0)(0))      //tried fr 2d array

//    case class test(name : String, age : Int)
//
//    val Arun=test("Arun",23)
//
//    val Atul=Arun.copy("Arun")
//
//    println(Arun.name)
//    println(Atul.age)
//    println(Atul == Arun)
//    println(Arun.hashCode())
//    println(Arun.canEqual(Atul))


//    object mainObject {
//      val oc1=new outerClass
//      val oc2=new outerClass
//      val ioc1=new oc1.innerClass
//      val ioc2=new oc2.innerClass
//      ioc1.x=10
//      ioc2.x=20
//      println(ioc1.x)
//
//
//    class outerClass{
//      class innerClass{
//        var x=1
//      }
//    }
  //
    println(Hello.getClass)



  }

  def add(i :Int ,j :Int=10) : Unit =print(i+j)

  def countP(s : String) : Int ={
    var res=0
    for(i<- 0 until s.length)
      {
        breakable{
          if(s.charAt(i)!='p')
            {
              break
            }
            else{
            res+=1
          }
        }
      }
     res
  }

  def factorial(i : Int) :Int ={
    if(i==1) 1
    else i * factorial(i-1)
  }

}
