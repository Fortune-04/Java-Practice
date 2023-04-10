import java.util.Scanner;

public class NoifCondEvenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = scan.nextInt();
        System.out.println("The number is "+evenOdd(num));
    }
    public static String evenOdd(int num){
        String[] str = {"Even", "Odd"};
        return str[num%2];
    }
}
