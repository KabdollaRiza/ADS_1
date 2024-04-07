import java.util.Scanner;

public class Task_5 {
    /**
     *  function for finding n-th elements in Fibonacci sequence using recursion
     * @param n number
     * @return rerturns fibonacci number
     */
    public static int FibNum(int n){
        if (n==0) return 0;
        else if (n==1) return 1;
        return FibNum(n-1)+FibNum(n-2);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int result = FibNum(n);
        System.out.println(result);
    }
}
