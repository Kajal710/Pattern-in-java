import java.util.Scanner;

public class MirrorLeftPyramid {
    public static void main(String[] args) {
        System.out.print("Enter the no of rows:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int TotalSpace=n-1;
        for(int line=1;line<=n;line++){
            for(int space=1;space<=TotalSpace;space++){
                System.out.print(" ");
            }
            for(int star=1;star<=line;star++){
                    System.out.print("*");
                
            }
            System.out.println();
            TotalSpace--;
        }
        sc.close();
    }
    
}