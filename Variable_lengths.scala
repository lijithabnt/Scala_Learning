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

variabe arguments should be given at end
val add1 = (x:Int,y:Int*) => x+y
val add1 = (x:Int*,y:Int*) => x+y //This cannot be done so we go for currying
because for first one we dont know how many arguments ar there and from where to take the second arguments list


