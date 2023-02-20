package dominio;

public class ej2_12 {


    public static int fib(int n) {
        if(n<=1) {
            return n;
        }else {
            return fib(n-1)+fib(n-2);
        }

    }

}

