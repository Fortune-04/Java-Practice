import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(fibonacciSeries(n));
    }

    public static  int fibonacciSeries(int n){
        if(n<=1){
            return n;
        }
        return fibonacciSeries(n-1)+fibonacciSeries(n-2);
    }
}
