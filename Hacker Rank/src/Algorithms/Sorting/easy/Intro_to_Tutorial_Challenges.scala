package sorting.easy

object Intro_to_Tutorial_Challenges {
    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var v = sc.nextInt()
        var n = sc.nextInt()
        var ar = Array.ofDim[Int](n)
        for(i<- 0 to n-1){
          ar(i)=sc.nextInt()
          if(ar(i)==v)
            print(i)
        }
    }
}