package hackerrank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    static void exeptionTryCatch() {
        try{
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(y==0)
                throw  new ArithmeticException("/ by zero");
            else
                System.out.println(x/y);
        }
        catch(InputMismatchException e){
            System.out.println(e.getClass().getName());
        }

        catch(ArithmeticException e){
            System.out.println(e);
        }
    }

    long power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        } else if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        } else {
            return (long) Math.pow(n, p);
        }
    }

}
