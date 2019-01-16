varargs : 

Dynamic number of arguments passing.
This is a varible length argument

def sum(x:Int*):Int = x.sum
sum(1,2)
sum(1,2,3)

val sum1 = (x:Int*) => x.sum1
val sum2 = (list:List[Int]) => list.sum2
//To convert a list as a argumet :
  =_*
