

package Easy

object designer_pdf_viewer {
  def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var h = new Array[Int](26);
        for(h_i <- 0 to 26-1) {
           h(h_i) = sc.nextInt();
        }
        var word = sc.next();
        var x = Array.ofDim[Int](26)
        for(c<- word.toCharArray().map(_.toInt)){
          x(c-97)+=1
        }
        var min=0
        var count = 0
        for(i<- 0 to 25){
          if(x(i)>0){
            if(h(i)>min)
              min = h(i)
            count += x(i)
          }
        }
        print(count*min)
    }
}