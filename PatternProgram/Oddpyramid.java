import java.util.Scanner;

public class Oddpyramid {
    public static void main(String[] args) {
        System.out.print("Enter the number of rows:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int Totalspace=n-1;
        for(int row=0;row<=n-1;row++){
            for(int space=1;space<=Totalspace;space++){
                System.out.print(" ");
            }
            int oddcompute=2*row+1;
            for(int star=1;star<=oddcompute;star++){
                System.out.print("*");
            }
            Totalspace--;
            System.out.println();
        }
        sc.close();
    }
    
}
