import java.util.Scanner;

public class LeftPyramid {
    public static void main(String[] args) {
        System.out.print("Enter the no of rows:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int Row=1;Row<=n;Row++){
            for(int star=1;star<=Row;star++){
                 System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
