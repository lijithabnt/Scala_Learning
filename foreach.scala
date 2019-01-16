//foreach

//used when we are writing to a file
//foreach is a procedure and it return unit
//foreach retunr unit,so function we are passing inside foreach shoud return unit
list4.foreach(f1)

list4 
val func: Int => Unit = (x:Int) => println(x)
list4.foreach(x=>x+1) //this doesnot return anything
list4.foreach(x=>println(x)) //println only gives unit
list4.foreach(println(_))


/*res6: Unit = ()

res7: List[Int] = List(1, 3, 4, 5)
func: Int => Unit = $Lambda$2298/1265981533@6ca03e77
res8: Unit = ()
1
3
4
5
res9: Unit = ()
1
3
4
5
res10: Unit = ()

*/



Source.fromFile("/tmp/text").getLines().toList.foreach(println())
//prints the elements in file
