package Easy

object Angry_Professor {
  def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var t = sc.nextInt();
        var a0 = 0;
        while(a0 < t){
            var n = sc.nextInt();
            var k = sc.nextInt();
            var a = new Array[Int](n);
            var c = 0
            for(a_i <- 0 to n-1) {
               a(a_i) = sc.nextInt();
               if(a(a_i)<=0)
                 c+=1
            }
            if(c>=k)
              print("NO\n")
            else
              print("YES\n")
            a0+=1;
        }
    }
}