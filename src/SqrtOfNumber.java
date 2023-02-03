import java.util.Scanner;

// This Code helps to Judge the given Number is perfect Square or not
public class SqrtOfNumber {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        //Bruteforce
//            int temp = (int)Math.sqrt(n);
//        if(temp * temp == n){
//            System.out.println("Number is perfect square");
//        }else{
//            System.out.println("Oops!");
//        }

        //Other way
            if(Math.floor(Math.sqrt(n)) == Math.ceil(Math.sqrt(n))){
                System.out.println("Number is Perfect Square");
            }else{
                System.out.println("Oops!");
            }
    }
}
