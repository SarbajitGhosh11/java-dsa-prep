import java.util.*;

public class BasicSorting {
    
    //bubbleSort
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for(int i=0; i<n; i++) {
            for(int j=0; j<=n-2-i; j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
     }
    

     //selectionSort
     public static void selectionSort(int arr[]) {
        int n = arr.length;
        for(int i=0; i<n-1; i++) {
            int smallest = Integer.MAX_VALUE;
            int minPos = i;
            for(int j=i+1 ; j<n; j++) {
                if(arr[j] < arr[minPos]) {
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
     }

    public static void main(String args[]) {
        int arr[] = {5, 4, 1, 3, 2};
        bubbleSort(arr);
        System.out.println("Our Bubble Sorted Array : " + java.util.Arrays.toString(arr));

        selectionSort(arr);
        System.out.println("Our Selection Sorted Array : " + java.util.Arrays.toString(arr));
    }
    
}
