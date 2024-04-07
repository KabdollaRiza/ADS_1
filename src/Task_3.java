import java.util.Scanner;

public class Task_3 {
    /**
     * r checking whether “n” is prime.
     * @param n number
     * @return returns answer
     */
    public static String checkNum(int n){
        if (n==2){
            return "Prime";
        }
        else if(n%2!=0){
            return "Prime";
        }
        else{
            return "Composite";
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String result = checkNum(n);
        System.out.println(result);
    }
}
