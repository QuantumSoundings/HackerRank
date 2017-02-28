package Easy

object Beautiful_Days_at_the_Movies {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    var i = sc.nextInt()
    var j = sc.nextInt()
    var k = sc.nextInt()
    var count = 0
    for(x<-i to j){
      var s = x+""
      if(Math.abs(x-(s.reverse.toInt))%k==0)
        count+=1
    }
    print(count)
      
    }
}