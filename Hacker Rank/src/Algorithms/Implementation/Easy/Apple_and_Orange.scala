

package Easy

object Apple_and_Orange {
    //S and T - start and end points of house
    //a and b - location of apple and orange trees
    //m and n - amount of apples and oranges
    //d - distance
  def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var s = sc.nextInt();
        var t = sc.nextInt();
        var a = sc.nextInt();
        var b = sc.nextInt();
        var m = sc.nextInt();
        var n = sc.nextInt();
        var apple = new Array[Int](m);
        for(apple_i <- 0 to m-1) {
           apple(apple_i) = sc.nextInt();
        }
        var orange = new Array[Int](n);
        for(orange_i <- 0 to n-1) {
           orange(orange_i) = sc.nextInt();
        }
        var ap = 0
        for(i<- apple){
          if(i+a>=s && i+a<=t)
            ap+=1
        }
        var or = 0
        for(i<- orange)
          if(i+b>=s && i+b<=t)
            or+=1
        print(ap +"\n" +or)
    }
}