package lectures.part1Basics

object except_handle {

  def main(args: Array[String]): Unit = {

    val x = scala.io.StdIn.readInt()
    val y = scala.io.StdIn.readInt()

    def fact(x: Int): Int = x * fact(x - 1)

    try {
      println(x / y)
      fact(100)
    }
    catch {
      case e: Exception => println(e)
      case e: ArithmeticException => println(e)
      //case e:Error => println("got error")
      case e: Throwable => println("got error Throwable")

    } finally { //What ever it is this should execute example:database connection.closing file
      println("I am in final block")
    }

  }


  //throws

  def divide(x: Int, y: Int) = {
    y match {
      case 0 => throw new ArithmeticException("stupid read maths") //throw keyword rectrn nothing and nothing is subclass of EVERYTHING so no syntax issue
    }
  }
divide(10,0)     //stack trace gives line number where erorr is 
}

/*
val result = try {
  println(x / y)
  fact(100)
}*/

