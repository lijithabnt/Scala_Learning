sealed  class Person(fname:String,lname:String)
//
//class Employee(fname:String,lname:String,empid:Int) extends Person(fname,lname)
//
//class SalariedEmployee(fname:String,lname:String,empid:Int,val salary:Double) extends Employee(fname,lname,empid)
//
//
//
//def calsalary(p:Person):Double = {
//  p match {
//    case b:SalariedEmployee => b.salary
//    case a:Employee => 0.0
//    case a:Person => 5.0 
//  }
//}
////here always we should give the parent class at the end,else everythign wil macth with parent calss
////and will not go the actual match
