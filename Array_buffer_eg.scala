//Remove the particular element passed in the buffer

val ar = ArrayBuffer(1,2,3,4,4,3,4,5)
def filter(ar:ArrayBuffer[Int],y:Int) : ArrayBuffer[Int] = {
  for (x<- ar) {
    if(x == y ) {
      ar -= y
    }
  }
  ar
}

filter(ar,3)

//Remove the elements in the buffer which are less than 3


def filter1(ar:ArrayBuffer[Int],y:Int) : ArrayBuffer[Int] = {

  for (x<- ar) {
    if(x < y ) {
      ar -= x
    }
  }
  ar
}


//Remove the elements in the buffer which are less than 3
//passing fucntion as a


def filter2(ar:ArrayBuffer[Int],f:Int => Boolean) : ArrayBuffer[Int] = {
val modArrayBuffer:ArrayBuffer[Int] = ArrayBuffer()
  for (x<- ar) {
    if(!f(x)) {
      modArrayBuffer += x
    }
  }
  modArrayBuffer
}

filter2(ar,(x:Int) => x > 3)
filter2(ar,(x:Int) => x != 3)



