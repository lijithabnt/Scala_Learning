//count of list using higher order function

val x = List(1,2,3,4,7,10,11)
x.foldLeft(0)((x:Int,y:Int) => x+1)
x.reduceLeft((x:Int,y:Int) => x+y)
x.tail.foldLeft(x.head)((x:Int,y:Int) => x+y)


/*
x: List[Int] = List(1, 2, 3, 4, 7, 10, 11)
res0: Int = 7
res1: Int = 38
res2: Int = 38
*/
