public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fibonacciSeries(n));
    }

    public static  int fibonacciSeries(int n){
        if(n<=1){
            return n;
        }
        return fibonacciSeries(n-1)+fibonacciSeries(n-2);
    }
}
