Arrays :

Collection of same type elements

//Arrays
val arr = Array(1,2,3,4,5) //array of length 5
val arr1:Array[Int] = Array[Int](1,2,3,4,5) //array of length 5
//Array[Int] - array of Ints
val arr3 = Array(1.0,2,3,4,5) //array of Double
val arr4 = Array(1.0,2,3,4,5,"liji") //array of Array[Any]

/*arr(0)
res6: Int = 1
arr1(1)
res7: Int = 2
arr4(3)
res8: Any = 4
arr1(9)
java.lang.ArrayIndexOutOfBoundsException: 9
at #worksheet#.#worksheet#(functions_cont.sc:88)

//Arrays are immutable

arr(0) = 5
arr
arr(0): Int = 5
res6: Array[Int] = Array(5, 2, 3, 4, 5)

arr.indexOf(3)
arr.length
arr.sorted
arr.size
arr
arr.toString

res6: Int = 2
res7: Int = 5
res8: Array[Int] = Array(1, 2, 3, 4, 5)
res9: Int = 5
res10: Array[Int] = Array(1, 2, 3, 4, 5)
res11: String = [I@4122563b

*/

*/

//List

val list = List(1,2,3,45)
//list(0) = 3//this cannot happen as lists are immutable
val list2 = 0 :: list //chanign the pointer and :: this is corn operator and we have to append only at the head
//eq command is used to comapre 2 lists
list == list2 //false
list
list.head //first element
list.tail //leftover after first
list.tail.tail.tail.tail //traversing from frist to last


class Employee1(salary:Double)
val e1 = new Employee1(100)
val e2 = new Employee1(100)
e1 == e2 //values might be same but they are 2 different pbjects and their memory locations are not the same
e1 eq e2
e1 eq e1


/*defined class Employee1
e1: Employee1 = Employee1@32faf59d
e2: Employee1 = Employee1@624ec3e3
res14: Boolean = false
res15: Boolean = false
*/


//ARRAY BUFFER (mutable)

val arrayBuffer = arr.toBuffer
arrayBuffer.append(9,10)
arrayBuffer

/*
arrayBuffer: scala.collection.mutable.Buffer[Int] = ArrayBuffer(1, 2, 3, 4, 5)
res19: Unit = ()
res20: scala.collection.mutable.Buffer[Int] = ArrayBuffer(1, 2, 3, 4, 5, 9, 10)
*/


//Recommended lists than Arrays.
