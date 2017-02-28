package Easy

object Sock_Merchant {
  def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var c = new Array[Int](n);
        for(c_i <- 0 to n-1) {
           c(c_i) = sc.nextInt();
        }
        c= c.sorted 
        var prev = -1
        var count,t = 0

        for(i<- c){
          if(i!=prev){
            t+=count/2
            count=1
            prev=i
          }
          else{
            count+=1
          }
        }
        t+=count/2
        print(t)
    }
}