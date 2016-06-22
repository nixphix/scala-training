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
    
     
     
     def factorialAcc(n: BigInt): BigInt = {
       def iterfact(acc: BigInt, x: BigInt): BigInt = if(x < 1) acc else iterfact(acc*x, x-1)
       iterfact(1,n)
     }
     factorialAcc(10000)
     //println(acc+x)
     
     
}
