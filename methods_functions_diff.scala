def computeinteger : AnyVal = {
  val x = 8
  if (x > 10) {
    x + 1
    println(s"value of x is $x")
  }
  else {
    x
  }
}

val x => def f(x:Int):Int = x*x //method
//cannot directly assign a method to a value
val y = (x:Int) => x*x //function
y(10)

val r = (x:Int,y:Int) => x+y
r(4,5)


def add(x:Int,y:Int):Int = {
  x+y
}

val ad = add(_,_)//place holder
ad(8,9)


val xw = (t:Int)=>t*t // ananymous function
5
"po"
val x = (t:Int)=>t*t // ananymous function

val fun3:(Int,Int) => Int = (x:Int,y:Int) => x+y
val fun4:(Int,Int,Int) => Int = (x:Int,y:Int) => x+y
