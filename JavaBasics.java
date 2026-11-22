import java.util.*;

public class JavaBasics {

    public static void hollowRectangle(int totRows, int totCols) {
        for(int i=1; i<=totRows; i++) {
            for(int j=1; j<=totCols; j++) {
                if(i==1 || i == totRows || j ==1 || j== totCols){
                    System.out.print("*"); 
                } else {
                    System.out.print("");
                }
            }
            System.out.println();
        }
    }
 
    public static void invertedRotated_HalfPyramind(int n) {
        //outer
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1 ; j<=n-i; j++) {
                System.out.print(" ");
            }
            //stars
            for(int j=1 ; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inverted_HalfPyramid_WithNumbers(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }

    public static void ZeroOneTriangle(int n) {
        for (int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                if((i+j) % 2 ==0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }

            System.out.println();
        }
    }

    public static void butterfly(int n){
        //1sthalf 
        for(int i=1; i<=n; i++) {
            //stars - i
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            //spaces -> 2* (n-i)
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }
            //stars - i
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //2ndhalf 
        for(int i=n; i>=1; i--) {
            //stars - i
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            //spaces -> 2* (n-i)
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }
            //stars - i
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void solid_rhombus(int n) {
        for(int i=1; i<=n; i++) {
        //spaces
        for(int j=1; j<=(n-i);j++) {
            System.out.print(" ");
        }  

        //stars
        for(int j=1; j<=n; j++) {
            System.out.print("*");
        }

        System.out.println();
        }
    }


    public static void diamond_pattern(int n) {
        //1sthalf
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<= 2*i-1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        
        //2ndhalf
        for(int i=n; i>=1; i--) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<= 2*i-1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


    }
public static void main(String args[]) {
    diamond_pattern(4);
}
}



