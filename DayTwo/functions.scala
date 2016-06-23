package daytwo
import java.util.Date

object Functions {
     System.out.println(new Date)
     //call by val vs name
     // create two boolean function to replace && and ||
     def and(a: Boolean,b: => Boolean):Boolean = if(a) b else false
     def or(a: Boolean,b: Boolean):Boolean = if(a) true else b
     
     and(false,false)
     and(false,true)
     and(true,false)
     and(true,true)
     
     or(false,false)
     or(false,true)
     or(true,false)
     or(true,true)
    
    
    
     //prog
     def test(x: Int): Int = {
     1
     0
     }
     //fun call
     println(test(4))
     
     
     
     
     //prog
     def factorial(n: Int): Int = if(n == 1) 1 else n * factorial(n-1)
     //fun call
     factorial(10)
     factorial(20)
     
     
     
     //prog
     def factorialBig(n: BigInt): BigInt = if(n == 1) 1 else n * factorialBig(n-1)
     //fun call
     factorialBig(20)
     //factorialBig(10000)
    
     
     //prog
     def factorialAcc(n: BigInt): BigInt = {
       def iterfact(acc: BigInt, x: BigInt): BigInt = if(x < 1) acc else iterfact(acc*x, x-1)
       iterfact(1,n)
     }
     //fun call
     factorialAcc(10000)
     //println(acc+x)
     
     
     def factScalaWay(n: BigInt) = BigInt(1) to n product
     
     //prog
     //Problem Statement: find square root of an Int x without using math library
     /*Hint: Newton's Method
     take a random number sqtx and then sqrt of x can be found by successively taking mean of sqtx and x/ysqtx 
     Example: x = 2 and lets take sqtx = 1
     
     Estimation     Quotient                 Mean
     1              2 / 1 = 2                1.5
     1.5            2 / 1.5 = 1.333          1.4167
     1.4167         2 / 1.4167 = 1.4118      1.4142
     1.4142         ...                      ...
     */
     /* Psudocode
     def sqrtIter(x,sqtx)
       if(isGoodEnough(x,sqtx)) sqtx  else sqrtIter(x,improve(x,sqtx))
     */
     
     def sqrtIter(guess: Double, x: Double): Double = 
          if (isGoodEnough(guess, x)) guess 
          else sqrtIter(improve(guess, x), x)
          
     def improve(guess: Double, x: Double) =
          (guess + x / guess) / 2
          
     def isGoodEnough(guess: Double, x: Double) =
          abs(guess * guess - x) < 0.001
     
     
     
     //Scope of the variable
     val x = 0
     def f(y: Int) = y + 1
     val result = {
     val x = f(3)
     x * x
     } + x
     
     // Which of the expr below throw error
     val v1 = 1 +2 
     val v2 = 1
     +2
     val v3 = 1+
     2
     val v4 = (1
     +2)
     
     def sum(f: Int => Int): (Int, Int) => Int = {
       def sumF(a: Int, b: Int): Int =
              if (a > b) 0
              else f(a) + sumF(a + 1, b)
              sumF
     }                                            //> sum: (f: Int => Int)(Int, Int) => Int
          
     def cube(x: Int) = x*x*x                     //> cube: (x: Int)Int
     
     def sumcube = sum(cube)                      //> sumcube: => (Int, Int) => Int
     
     sumcube(1,3)                                 //> res10: Int = 36
     
     sum(cube)(1,3)
     
     def sum(f: Int => Int)(a: Int, b: Int): Int =       
       if (a > b) 0 else f(a) + sum(f)(a + 1, b)


     def add(x: Int, y: Int) = x+y                //> Add: (x: Int, y: Int)Int
     def ++(x: Int) = add(x,1)                    //> ++ : (x: Int)Int
     
     ++(1) 
     
     def sc10(x: Int) = sum(cube)(x,10)           //> sc10: (x: Int)Int
          
     sc10(9)                                      //> res13: Int = 1729
     
     def mapReduce(f: Int => Int, combine: (Int,Int) => Int, identity: Int)(a: Int, b: Int): Int =
         if(a>b) identity
         else combine(f(a),mapReduce(f,combine,identity)(a+1,b))

}
