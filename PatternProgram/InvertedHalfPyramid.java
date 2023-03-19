import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        System.out.print("Enter the number of Rows:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int Row=1;Row<=n;Row++){
            for(int star=n;star>=Row;star--){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
