/*
 *****
 *****
 *****
 *****
 *****
 */
import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        System.out.print("Enter the number of Lines:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int row=0;row<n;row++){  //for print Rows
            for(int star=0;star<n;star++){  //for print stars
                System.out.print("*");
            }
            System.out.println();

        }
        sc.close();
    }
    
}
