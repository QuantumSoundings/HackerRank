

package Easy

object Between_Two_Sets {
  def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var m = sc.nextInt();
        var a = new Array[Int](n);
        var x = 1
        var max = 0
        for(a_i <- 0 to n-1) {
           a(a_i) = sc.nextInt();
           if(a(a_i)>max)
             max =a(a_i)
           x*=a(a_i)
        }
        var b = new Array[Int](m);
        var min = Integer.MAX_VALUE
        for(b_i <- 0 to m-1) {
           b(b_i) = sc.nextInt();
           if(b(b_i)<min)
             min = b(b_i)
        }
        var count = 0
        var z = Array.ofDim[Int](min+1)
        for(i<- 1 to min)
          if(min%i ==0)
            z(i)=i
        //print(z.toString())
        var i = min
        while(i>=1){
          if(z(i)!=0){
            var t = true
            for(a_i<- a){
              if(i%a_i !=0)
                t=false
            }
            for(b_i<- b)
              if(b_i%i!=0)
                t = false
            if(t)
              count+=1
          }
          i=i-1
            
        }
        print(count)
    }
}