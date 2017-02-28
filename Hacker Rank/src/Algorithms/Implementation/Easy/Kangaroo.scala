package Easy
object Kangaroo {
  def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var x1 = sc.nextInt();
        var v1 = sc.nextInt();
        var x2 = sc.nextInt();
        var v2 = sc.nextInt();
        var yes = false
        var t = 0
        if(v1>v2)
          while(t<=10000){
            if(x1==x2){
              print("YES")
              x1= 100000
              yes = true
            }
            else{
              x1=x1+v1
              x2=x2+v2
              t+=1
            }
          }
        if(!yes)
          print("NO")
    }
}