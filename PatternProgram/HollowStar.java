import java.util.Scanner;

public class HollowStar {
    public static void main(String[] args) {
        System.out.print("Enter the no of line:");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int line=1;line<=n;line++){
            for(int star=1;star<=n;star++){
                if(line == 1 || line ==n ||star==1||star==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }
        sc.close();
    }
    
}
