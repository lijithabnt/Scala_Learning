//MAP - higherorder function(when length of i/p and o/p list is same)
//This is because map takes function as a argument

val list4 = List(1,3,4,5)
val f = (x:Int) => x+1
list4.map(f)

val f1 :Int => String = (x:Int) => x+"1"
list4.map(f1) //type is list of strings

//This is basically used for conversion of datatypes

//Otherways of wrting
list4.map((x:Int) => x+"1")
list4.map(x => x+"1")
list4.map(_+"1")  //this is palceholder when we have only one element
list4.map(_+1) //this is palceholder when we have only one element 

//list4.map(_+"1")  means every element of list conctenated with 1
//list4.map(_+1) means every element of list added with 1 

