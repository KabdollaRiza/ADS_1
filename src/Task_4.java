import java.util.Scanner;

public class Task_4 {
    /**
     * finding factorial
     * @param n number
     * @return returns factorial
     */
    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        return factorial(n-1)*n;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }
}
