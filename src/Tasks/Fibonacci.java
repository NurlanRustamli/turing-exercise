package Tasks;

public class Fibonacci {
    public static int fib(int n){

        int a= 0,b=1;


        int sum = 0;
        for (int i = 2; i <= n; i++) {
            sum  = a+b;
            a=b;
            b=sum;
        }
        System.out.println("revised number:");
        System.out.println(sum);
        return sum;
    }
}
