import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        System.out.print("Enter the number of Rows:");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int TotalSpace=n-1;
        for(int row=1;row<=n;row++){
            for(int space=1;space<=TotalSpace;space++){
                System.out.print(" ");
            }
            for(int star=1;star<=row;star++){
            System.out.print(" *");
            }
            TotalSpace--;
            System.out.println();
        }
        sc.close();
    }
    
}
