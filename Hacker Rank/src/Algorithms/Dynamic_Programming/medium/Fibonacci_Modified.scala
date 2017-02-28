package Algorithms.Dynamic_Programming.medium
import scala.math.BigInt
object Fibonacci_Modified {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    var t1 = sc.nextInt()
    var t2 = sc.nextInt()
    var n = sc.nextInt()
    var ar = Array.ofDim[BigInt](n)
    ar(0)=t1
    ar(1)=t2
    for(i<- 0 to n-3)
      ar(i+2)= ar(i)+ar(i+1).pow(2)
    print(ar(n-1))  
  }
    
}