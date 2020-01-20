import java.util.ArrayList;
import java.util.Arrays;

class Q3 {

public static ArrayList<Integer> add (ArrayList<Integer> num1, ArrayList<Integer> num2) {
  ArrayList<Integer> add  = new ArrayList<Integer>();
   
    int s1 = num1.size();
    int s2 = num2.size();

   if (s2 > s1) {
       return add(num1, num2);
    }
 
  ArrayList<Integer> out = new ArrayList<Integer>(Math.max(s1, s2) +1);
  
  int i = 1;
  int c = 0;
  
  do {
      int v = num1.get(s1-i) + num2.get(s2-i) + c;
      c = v/10;
      out.add(0, v % 10);
    } while(++i <= s2);
    
  do {
    int v = num1.get(s1-1)+c;
    c = v/10;
    out.add(0, v % 10);
    } while(++i <= s1);
    
    if (c > 0) {
        out.add(0, c);
    }
    
return out;
 }
}