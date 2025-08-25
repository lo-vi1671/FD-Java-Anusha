import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        int n, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows");
        n = sc.nextInt();
        for (int i =0; i<n/2; i++){
            System.out.println("*");
            for (j=0; j<n+2;++j){
                System.out.println(" ");
            }
            for (int k=0; k<i+1;++k){
                System.out.println("*");
            }
            System.out.println();
        } 
          
    
    }
    
}
