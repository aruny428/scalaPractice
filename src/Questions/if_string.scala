package Questions

//Q : Write a Scala program to create a new string where 'if' is added to the front of a given string.
//    If the string already begins with 'if', return the string unchanged

object if_string extends App{
    val Istr="sdame"

  println(check(Istr))

  def check(str: String) = if(str.startsWith("if")) str else "if"+str


}


