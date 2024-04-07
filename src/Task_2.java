import java.util.Scanner;

public class Task_2 {
    /**
     * average of array
     * @param n size of array
     * @param arr array
     * @return returns average number
     */
    public static double average(int n, int[] arr){
        double sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        return sum/n;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i] = scan.nextInt();
        }
        double result = average(n,array);
        System.out.println(result);
    }
}
