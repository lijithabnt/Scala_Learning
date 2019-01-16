//A function cretaed with free varible is closure

//Example : 

//Pure closure : 

val y = 20 //global scope
val f = (x:int) => x*10 + y
f(2) = 30

 //When a function is dependent of any function which is outside the fucntion is closure

//impure closure : 

var y = 40 //this makes difference
val f = (x:int) => x*10 + y
f(2) = 60

//y changing inside fucntion 

var y = 10
val f = (x:int) => {y:y+1;x*10 + y}
f(2) = 31
y= 11

