public class Rightpascal {
    public static void main(String[] args) {
        int n=9;
        int mid=n/2;
        int totastar =1;
        for(int row=1;row<=n;row++){
            for(int star=1;star<=totastar;star++){
                System.out.print("*");
            }
            if(row<mid){
                totastar++;
            }
            else{
                totastar--;
            }
            System.out.println();
        }
    }
    
}
