import java.util.Scanner;

public class MirrorInvertedHalfPyramid {
    public static void main(String[] args) {
        System.out.print("Enter the no of rows:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int TotalSpace=0;
        for(int line=n;line>=1;line--){
            for(int space=1;space<=TotalSpace;space++){
                System.out.print(" ");
            }
            for(int star=1;star<=line;star++){
                System.out.print("*");
            }     
            TotalSpace++;
            System.out.println();
        }
        sc.close();
    }
    
}
