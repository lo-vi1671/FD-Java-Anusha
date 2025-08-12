import java.util.Scanner;
public class Userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        System.out.println(a);
        
        System.out.println("enter first number");
        int c = sc.nextInt();
        System.out.println("enter second number");
        int d = sc.nextInt();
        int sum = c + d;
        System.out.println(sum);

        System.out.println("enter first number");
        float x = sc.nextFloat();
        System.out.println("enter second number");
        float y = sc.nextFloat();
        float s = x + y;
        System.out.println(s);
        




    }
    
}
