Type : 

Int,double,string 

Custom type : 

The type that we define,for eg : 

By defining class we define a cutom type

val x:Int = 10 //Int type
val Y = (1,2,3) //TUPLE type of (Int,Int,Int)
val z:Range = 1 to 10 //Range is a type

type RR = Range
val u:RR =  1 to 1999


//Custom type
class  Employee {

}
 val emp:Employee = new Employee


//Class coordinate

class Coordinate(x:Int,y:Int)

val newpoint:Coordinate = new Coordinate(1,2)


//or

type coordinates = (Int,Int)


//Scenario where this custom type is needed
type ThreeInt = (Int,Int,Int)
def add(x:(Int,Int,Int) , incr:Int):(Int,Int,Int) ={
  (x._1+incr,x._2+incr,x._3+incr)
}
def addA(x:ThreeInt , incr:Int):ThreeInt ={
  (x._1+incr,x._2+incr,x._3+incr)
}

