object Question1_2_3 {
  def main(args:Array[String]){
    var(c,f,g,i,j,k,m,n)=('X',12.0f,4.0f,2,2,2,5,5)

    println(k+12*m)
    println(m/j)
    println(n%j)
    println(m/j*j)
    println(f+10*5+g)
    //println(++i*n) // This gives an eror beacause ++ is not a valid operator in Scala

    var(a:Int,b:Int,c1:Int,d:Int,k1:Float)=(2,3,4,5,4.3f) // c and k are redefined. They can't be redefined so we initialised c as c1 and k as k1
    //println(--b*a+c1*d--) ----> a)
    // -- is not a valid operator in Scala
    // But in JAVA it is a valid operator. According to JAVA the answer is 2*2+4*5-> 24.The value of b is 2.
    //println(a++) ----> b)
    //++ is not a valid operator in Scala
    //But in JAVA it is a valid operator. According to the JAVA the answer is 2. Now the value of a is 3.
    println(-2*(g-k1)+c1)
    //println(c1=c1++)
    //++ is not a valid operator in Scala
    //  But in JAVA the answer is 4
    //println(c1=++c1*a++) ---->d)
    //++ is not a valid operator in Scala
    //But in JAVA the answer is 5*3-> 15
    //Now the value of a is 4

  }
}
