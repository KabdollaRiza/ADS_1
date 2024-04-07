import java.util.Scanner;

public class Task_10 {
    /**
     * function for finding GCD(a, b) using recursion
     * @param a number
     * @param b number
     * @return answer
     */
    public static int GDC(int a,int b){
        if (a-b==1){
            return 1;
        }
        else if (b==0){
            return a;
        }
        else{
            return GDC(b,a%b);
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int result = GDC(a,b);
        System.out.println(result);
    }
}
