package Algorithms.Dynamic_Programming.medium

object Max_Subarray {
  def main(args: Array[String]) {
      val sc = new java.util.Scanner (System.in);
      var t = sc.nextInt()
      for(i<- 1 to t){
        var n = sc.nextInt()
        var ar = Array.ofDim[Int](n)
        var nc,c = 0
        var m = Integer.MIN_VALUE
        for(x<- 0 to n-1){
          ar(x) = sc.nextInt()
          if(ar(x)>0)
            nc+=ar(x)
          if(ar(x)>m)
            m=ar(x)
        }
        //Contiguous
        var meh,msf=ar(0)
        for(i<- 1 to n-1){
          meh= Math.max(ar(i),meh+ar(i))
          msf= Math.max(msf,meh)         
        }
        if(nc==0)
            print(msf+" "+m+"\n")
        else
            print(msf +" "+ nc+"\n")
      }
  }
}