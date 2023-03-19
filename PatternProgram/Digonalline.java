public class Digonalline {
    public static void main(String[] args) {
        int n=8;
        int leftspace = n-1;
        int rightspace=0;
        for(int row=1;row<=n;row++){
            for(int space=1;space<=leftspace;space++){
                System.out.print(" ");
            }
            System.out.print("*");
            leftspace--;
            for(int space=1;space<=rightspace;space++){
                 System.out.print(" ");
            }
            rightspace++;
            System.out.println();
        }
    }
    
}
