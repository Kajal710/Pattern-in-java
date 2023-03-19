public class Leftpascal {
    public static void main(String[] args) {
        int n=9;
        int mid=n/2;
        int totalspace=mid;
        int totastar=1;
        for(int row=1;row<=n;row++){
            for(int space=1;space<=totalspace;space++){
                System.out.print(" ");
            }
            for(int star =1;star<totastar;star++){
                System.out.print("*");
            }
            if(row<mid){
                totastar++;
                totalspace--;
            }
            else{
                totastar--;
                totalspace++;
            }
            System.out.println();
        }
    }
    
}
