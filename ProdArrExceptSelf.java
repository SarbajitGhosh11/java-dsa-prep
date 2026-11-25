import java.util.*;


public class ProdArrExceptSelf {
    public static int[] productArray(int[] nums) {

        //left product 
        int leftProduct[] = new int[nums.length];
        leftProduct[0] = 1;
        for(int i=1; i<nums.length; i++) {
            leftProduct[i] = leftProduct[i-1] * nums[i-1];
        }
    

        //right product
        int rightProduct[] = new int[nums.length];
        rightProduct[nums.length -1 ] = 1;
        for(int i= nums.length-2; i>=0; i--) {
            rightProduct[i] = rightProduct[i+1] * nums[i+1];
        }
    
 
    int ans[] = new int[nums.length];
    for(int i=0; i<nums.length; i++) {
        ans[i] = leftProduct[i] * rightProduct[i];
    }
        return ans;


}

public static void main(String args[]) {
   int[] nums = {1, 2, 3, 4};
   System.out.println("Ans :" + java.util.Arrays.toString(productArray(nums)));
}
}


// git add .                  
// >> >> git commit -m "Solved Product Array Except Self"                        
// >> >> git push                                                                  
// >> >>    