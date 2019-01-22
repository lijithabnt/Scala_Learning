//Recursive fun(for reduce left)

//def f(x:Int,y:Int) = x+y

def listop(list:List[Int],base:Int,f:((Int,Int) => Int)):Int= {
  if (list == Nil) {
    base
  }
  else {
    f(list.head,listop(list.tail, base, f))
  }
}

listop(List(1,2,3,4),1,(x,y)=>x+y)

//f(1,listop(List(2,3,4),1,f) => 2
//f(1,listop(List(3,4),1,f) => 2+2 = 4
//f(3,listop(List(4),1,f) => 4+3 = 7+4 = 11

//Array

def fillArray(array:Array[Int],value:Int,start:Int):Array[Int] = {
  if(start == array.length) //stop when it reaches max length of array
  {
    array
  }
  else{
    array(start) = value
    fillArray(array,value,start+1)
  }

}

fillArray(Array(1,2,3),0,0) //Array(0,0,0)

val newarr = Array(1,2,3)
newarr.head
newarr.tail

//operation on array(arrays are mutable,lists are immutable
def arrayop(array:Array[Int],index:Int,f:(Int,Int)=>Int) : Int= {
  if (index < array.length-1){
    f(array(index),arrayop(array,index+1,f))
  }
else {
  array(index)
}
}

arrayop(Array(1,2,3,8),0,(x,y)=>x+y)



 def fact(i:Int):Int =  if(i<2) 1 else i*fact(i-1)
fact(9)

//sum of squares

def sumofsquares(n:Int):Int = if(n == 1) 1 else sumofsquares(n-1)+ n*n
sumofsquares(3)

//sum of number
def sumOfNum(Num:Int) :Int = if (Num == 1) 1 else sumOfNum(Num-1)+Num
sumOfNum(9)

//count till
def countTillNum(Num:Int) :Int = if (Num == 1) 1 else  Num+countTillNum(Num-1)
countTillNum(9)

