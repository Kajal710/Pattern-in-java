import java.util.Scanner;

public class Fullpyramid {
    public static void main(String[] args) {
        System.out.print("Enter your no of rows");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mid = n/2;
        int TotalSpace = mid;
        int starcount = 1;
        for(int row = 1;row<=n;row++){
            for(int space=1;space<=TotalSpace;space++){
                System.out.print(" ");
            }
            for(int star=1;star<=starcount;star++)
            {
                System.out.print("*");
            }
            if(row<mid){
                starcount+=2;
                TotalSpace--;
            }
            else{
                starcount-=2;
                TotalSpace++;
            }
            System.out.println();
        }
        sc.close();
        
    }
    
}
