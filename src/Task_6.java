import java.util.Scanner;

public class Task_6 {
    /**
     *function that returns “a^n”.
     * @param num number
     * @param degree power
     * @return returns n-th power of number
     */
    public static int numDegree(int num,int degree){
        if (degree==0){
            num=1;
        }
        else if (degree==1){
            return num;
        }
        else{
            int result=1;
            for(int i=0;i<degree;i++){
                result*=num;
            }
            num = result;
        }
        return num;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int degree = scan.nextInt();
        int result = numDegree(num,degree);
        System.out.println(result);
    }
}
