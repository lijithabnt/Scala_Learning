//currying
//Only applied for methods not functions

val add = (x:Int) => (y:Int) => x+y
def curriedsun(x:Int)(y:Int) = x+y

//When we have 2 varargs,that is
def add(x:Int*) (y:Int*) = x+y

//varagrs should be always at the end

////varagrs should be always at the end
//used in partially appied fucntions

def addcurry(x:Int)(y:Int) = x+y
addcurry(6)(2)
val partial = addcurry(6)_
partial(2)



val add = (x:Int) => (y:Int) => x+y
val add3 = add(3)
add3(2)
add(2)(3)
