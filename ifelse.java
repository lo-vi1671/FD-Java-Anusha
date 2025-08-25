import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int marks = sc.nextInt();
        if (marks>=9){
            System.out.println("Grade A");
        } else if (marks>=8){
            System.out.println("Grade B");
        } else {
            System.out.println("Grade O");
        }


    }
    
}
