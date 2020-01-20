import java.util.ArrayList;
import java.util.Arrays;

class MarkMain{

    public static ArrayList<Integer> seiveOfErath (int n) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            nums.add(i);
        }

        for (int i = 0; i < nums.size(); i++) {
            int start = nums.get(i);
            for (int p = i+1; p < nums.size(); p++) {
                if (nums.get(p) % start == 0) {
                    nums.remove(p); 
                    p--;
                }
            }
        }

        
        return nums;
    }

    public static ArrayList<Integer> goldbach (int n) {
        ArrayList<Integer> nums = seiveOfErath(n);
        ArrayList<Integer> out = new ArrayList<Integer>();

        int number = 0;
        int start = 0;
        
        for (int i = 0; i < nums.size(); i++) {
            
            start = nums.get(i);
            number = n - start;
        }

        if(nums.contains(new Integer(number))) {
        out.add(start);
        out.add(number);
        }
        
     return out;
    }

    public static void main(String [] args) {    

        System.out.println(Arrays.toString(goldbach(100).toArray()));

    
    }

}