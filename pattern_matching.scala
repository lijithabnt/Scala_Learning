constant pattern matching :
=========================

import scala.util.Random

val x: Int = Random.nextInt(8)

x match {
  case 0 => "zero"
  case 1 => "one"
  case 2 => "two"
  case _ => "many"
}

//O/p : main


Variable pattern matching :
=========================

val y = 7
def varibalematch(y:Any):String = {
y match {
  case a => s"i have got $a"
  //case _ => "OK"
} 
}
//this code is unreachable,as it wont go to default case
//What ever we are giving goes to a and thats the default case

import Math.{PI,E}
def variableMatchConflict(x:Any):String = {
  x match {
    case PI => s"GOt PI $PI" //PI - is constantc//ase pi => s"got $pi"(this is varible)
    case E => s"GOt PI $E"
    case _ => s"got default"
  }
}

variableMatchConflict(PI)
//res1: String = GOt PI 3.141592653589793

variableMatchConflict("HI")
//res1: String = got default


//Eliminated by erasure
Map("A" -> "1")
def isIntIntMap(x:Any):Boolean = {
  x match {
    case a:Map[Int,Int] => true
    case _ => false
  }
}

def isIntIntArray(x:Any):Boolean = {
  x match {
    case a:Array[Int] => true
    case _ => false
  }
}
isIntIntMap(Map("10" -> "1"))
isIntIntMap(Map(10 -> 1))//will get a warning eliminated by erasure
isIntIntArray(Array(1,2))
isIntIntArray(Array("1","2"))
