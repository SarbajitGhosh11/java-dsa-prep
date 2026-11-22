import java.util.*;

public class TrappingRainwater {

    public static int trappedRainwater(int height[]) {

    //Find LeftmaxBoundary
    int leftMax[] = new int[height.length];
    leftMax[0] = height[0];
    for(int i=1; i<height.length; i++) {
        leftMax[i] = Math.max(height[i], leftMax[i-1]);
    }

    //Find RightMaxBoundary
    int rightMax[] = new int[height.length];
    rightMax[height.length -1] = height[height.length-1]; //make this array in reverse order from right to left
    for(int i=height.length-2; i>=0; i--) {
        rightMax[i] = Math.max(height[i], rightMax[i+1]);
    }

    int totalWater = 0;
    int width = 1;

    //total trapped water
    for(int i=0; i<height.length; i++) {

    int waterLevel = Math.min(leftMax[i], rightMax[i]);
    int trappedWater = waterLevel - height[i];
    totalWater+= trappedWater * width;
    }


    return totalWater;
}

public static void main(String args[]) {
    int height[] = {4,2,0,6,3,2,5};

    System.out.println("The total trapped rainwater is :" + trappedRainwater(height));
}
}