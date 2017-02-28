package Easy

object Divisible_Sum_Pairs {
  def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var k = sc.nextInt();
        var a = new Array[Int](n);
        for(a_i <- 0 to n-1) {
           a(a_i) = sc.nextInt();
        }
        var count=0
        for(i<- 0 to n-2)
          for(x<- i+1 to n-1)
            if((a(x)+a(i))%k==0)
              count+=1
         print(count)  
  }
}