//Is there a difference when we create a object with var and val

class counter(var c:Int) {
  def increment(incrtimes: Int): Int = {
    for (i <- 1 to incrtimes) {
      c = c + 1
    }
    c
  }

  def decrement(devcal:Int):Int = {
    c=c-devcal
    c
  }

  def increment(incrtimes: Int, incrval: Int) = {
    for (i <- 1 to incrtimes) {
      c = c + incrval
    }
    c
  }
}

object newobj extends  App {

  val ex = new counter(9)
  var ex2 = new counter(12)
  var ex3 = new counter(12)
  println(ex2 == ex3) 
  //Two objects in a normal class will not be equal as every object is unique,even after cerating with the same val
  //eg: for a class Human,objects twins are are same.Basically it matches the address of the object and address of objects at any point are not equal
  //And we cannot match objects which are created using val as ittheows reassignment not possible
