Both Array and ArrayBuffer are mutable, which means that you can modify elements at particular indexes: a(i) = e

ArrayBuffer is resizable, Array isn't. If you append an element to an ArrayBuffer, it gets larger. 
If you try to append an element to an Array, you get a new array. Therefore to use Arrays efficiently, 
you must know its size beforehand.

var array1 = new Array[Int](10)
var ar2 = new Array[Int](2)
ar2
ar2 += 1 //this throws an error as we cannot append value to array
array1(1)= 100
array1 = Array(1,2,3)

/*
array1: Array[Int] = Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
ar2: Array[Int] = Array(0, 0)
res21: Array[Int] = Array(0, 0)
array1(1): Int = 100
array1: Array[Int] = Array(1, 2, 3)
*/


import scala.collection.mutable.ArrayBuffer
val arraybf = new ArrayBuffer[Int](10);
arraybf += 10
arraybf += 12
arraybf += 13
arraybf(2) = 14
arraybf += 7

/*
import scala.collection.mutable.ArrayBuffer
arraybf: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer()
res22: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(10)
res23: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(10, 12)
res24: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(10, 12, 13)
arraybf(2): Int = 14
res25: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(10, 12, 14, 7)
*/
