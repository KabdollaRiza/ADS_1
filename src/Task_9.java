import java.util.Scanner;

public class Task_9 {
    /**
     * finds Cnk(binomial coefficient)
     * @param k number
     * @param n number
     * @return answer
     */
    public static int binomialCoefficient(int k,int n){
        if (k==0||k==n){
            return 1;
        }
        if (n==0||n==1){
            return 1;
        }
        else{
            return binomialCoefficient(k-1,n-1)+binomialCoefficient(k,n-1);
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int result = binomialCoefficient(k,n);
        System.out.println(result);
    }
}
