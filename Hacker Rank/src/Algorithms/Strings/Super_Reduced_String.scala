package Algorithms.Strings

object Super_Reduced_String {
  def main(args: Array[String]) {
     val sc = new java.util.Scanner (System.in);
     var x = sc.next()     
     
     var t=x
     var tprev=""
     while(!tprev.equals(t)){
       tprev=t
       t=""
       var c=0
       var prev = ']'
       for(i<- 0 to tprev.length-1){
         if(prev!=tprev.charAt(i)){
           if(c%2!=0)
             t+=prev
           prev=tprev.charAt(i)
           c=1
         }
         else
           c+=1
       }
       if(c%2!=0)
           t+=prev
       
      }
     if(t.length()==0)
         print("Empty String")
       else
         print(t)
  }
}