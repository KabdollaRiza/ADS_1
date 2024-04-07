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
            return num*numDegree(num,degree-1);
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
