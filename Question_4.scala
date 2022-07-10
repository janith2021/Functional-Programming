object Question_4 {
  def main(args:Array[String]): Unit ={
    printf("Your TakeHome Salary= Rs: %.3f\n",TakeHomeSalary(40,30))
    printf("Your Profit= %d\n",totalProfit(20))
    printf("Your Profit= %d\n",totalProfit(15))
    printf("Your Profit= %d\n",totalProfit(10))
  }

  // 4 a)
  def wage(h1:Int)=250*h1
  def OT(h2:Int)=85*h2
  def Income(h1:Int,h2:Int)=OT(h1)+wage(h2)
  def Tax(income:Double)=0.12*income

  def TakeHomeSalary(h1:Int,h2:Int): Double ={
    Income(h1,h2)-Tax(Income(h1:Int,h2:Int))
  }

  // 4 b)

  def atendees(price:Int)=120+(15-price)/5*20
  def income(price:Int)=atendees(price)*price
  def totalCost(price:Int)=atendees(price)*3+500

  def totalProfit(price:Int):Int={
    income(price)-totalCost(price)
  }
}
