package Easy

object Bon_Appetit {
  def main(args: Array[String]) {
       val sc = new java.util.Scanner (System.in);
       var n = sc.nextInt()
       var k = sc.nextInt()
       var c = Array.ofDim[Int](n)
       for(i<- 0 to n-1)
         c(i) = sc.nextInt()
       var b = sc.nextInt()
       var sum = 0
       for(i<- 0 to n-1)
         if(i!=k)
           sum+=c(i)
       if((sum/2)!=b)
         print(b-(sum/2))
       else
         print("Bon Appetit")
    }
}