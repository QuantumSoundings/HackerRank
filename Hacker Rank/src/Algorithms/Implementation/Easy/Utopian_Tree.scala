package Easy

object Utopian_Tree {
  def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var t = sc.nextInt();
        var a0 = 0;
        while(a0 < t){
            var n = sc.nextInt();
            var x = 1
            var i = 0
            while(i<n){
              if(i%2 ==0){
                x=x*2
              }
              else
                x+=1
              i+=1
            }
            print(x +"\n")
            a0+=1;
        }
    }
}