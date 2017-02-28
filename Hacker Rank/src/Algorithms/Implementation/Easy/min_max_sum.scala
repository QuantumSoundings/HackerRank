package Easy



object min_max_sum {
  def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
        
*/
        var x = readLine.split(" ").map(_.toLong);
        x =x.sorted
        print(x(0)+x(1)+x(2)+x(3) + " " + (x(1)+x(2)+x(3)+x(4)))
    }
}