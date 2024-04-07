import java.util.*;

public class Task_1 {
    /**
     * find the minimum number in the array
     * @param n size of array
     * @param minNum finds the min number
     * @param arr array
     * @return returns the answer
     */
    public static int minNumber(int n,int minNum,int[] arr){
        for(int i=0;i<n;i++){
            if(arr[i]<minNum) {
                minNum=arr[i];
            }
        }
        return minNum;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i] = scan.nextInt();
        }
        int minNum = array[0];
        int result = minNumber(n,minNum,array);
        System.out.println(result);
    }
}
