case class Person(fname:String,lname:String)
case class Employee(person:Person,empid:Int,sal:Double)

def matchPerson(x:Any):String = {
  x match {
    case Employee(Person(fname,"verma"),_,_) => s"Valida lastname $fname verma"
    case Employee(Person(_,_),_,10000) => s"Found an emp with salary 1000"
    case Employee(_,1,_) => s"Found an Employee with ID 1"
    case _ => s"Not found"
  }
}


matchPerson(Employee(Person("obero","vivek"),1,2000))
matchPerson(Employee(null,1,1000))
matchPerson(Employee(Person("vivek","verma"),1,2000))
