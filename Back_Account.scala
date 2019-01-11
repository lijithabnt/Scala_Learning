/*Extend the following BankAccount class to a CheckingAccount class that charges $1 for every deposit and withdrawal.
2. Extend the BankAccount class of the preceding exercise into a class SavingsAccount that earns interest every month 
(when a method earnMonthlyInterest is called) and has three free deposits or withdrawals every month. 
Reset the transaction count in the earnMonthlyInterest method.
*/


package com.lijitha

class Bank_Account(initialBalance : Double) {
 private var balance = initialBalance
 def currentBalance = balance

 def deposit(amount:Double) = {
   balance = balance+amount
   balance
 }

 def withdraw(amount:Double) = {
   balance = balance-amount;
   balance
 }
}

================================================
================================================

package com.lijitha

object AccountCheck {
 def main(args: Array[String]): Unit = {
   val bank_Account1 = new Bank_Account(100)
   bank_Account1.deposit(50)
   bank_Account1.withdraw(30)
   //bank_Account1.balance = 10000
   println(bank_Account1.currentBalance)


   val bank_Account2 = new CheckingAccount(1000)
   println(bank_Account2.deposit(400))
   println(bank_Account2.withdraw(200))
   println(bank_Account2.deposit(100))
   println(bank_Account2.withdraw(20))
   println(bank_Account2.totalCommissionCheckin)
   //println(bank_Account2.currentBalance)
 }
}
======================================================
======================================================

package com.lijitha
class CheckingAccount(initialBalCheck : Double) extends Bank_Account(initialBalCheck) {

 private val commission = 1
 private var totalcommission = 0.0
 def totalCommissionCheckin : Double = totalcommission // since its a private varibale we are deficnign a function for other to see
 override def deposit(amount: Double): Double = {
   totalcommission = addCommission(commission)
   super.deposit(amount-commission)
 }

 override def withdraw(amount: Double): Double = {
   totalcommission = addCommission(commission)
   super.withdraw(amount-commission)
 }

 def addCommission(commission:Double) :Double = {
   totalcommission+commission
 }

}
