//Integer to Binary

var number = 100
var bin = 0
var rem =1
var i = 1
while ( number > 0)
  {
    rem = number%2
    number = number/2
    bin = bin+(i*rem)
    i=i*10

  }
println(bin)

//reverse a string
def string_reversal(new_string:String) : String = {
  var new_len = new_string.length
  var reversed_str = ' '
  print(new_len)
  while (new_len != 0) {
    reversed_str = new_string(new_len - 1)
    new_len = new_len - 1
    print(reversed_str)
  }
}

string_reversal("lijitha")


//to find if its prime number or no

val input_val = 9
if(input_val%1 == 0 && input_val%input_val == 0 && input_val%2 != 0 ) {
  print("Its prime number")
}
else{
    print("Its not prime")
  }


// to find fibnocci series

var a = 1
var b = 0
var ie = 0
var n = 8
while(ie < n){
  val c = a+b
  a=b
  b=c
  ie = ie +1
  print(a)

}

//fibnocci using forloop


var ad = 1
var bd = 0
var id = 0
var nd = 8
while (id < nd) {
  val c = a+b
  a=b
  b=c
  ie = ie +1
  print(a)

}
