public class CrossDigonal {
    public static void main(String[] args) {
        int n=5;
        for(int row=0;row<n;row++){
            for(int star=0;star<n;star++){
                if(row==star||(row+star)==n-1){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
    
}
