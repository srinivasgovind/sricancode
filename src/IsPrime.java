import java.util.Scanner;

public class IsPrime {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        //Bruteforce Approach

        int noOfFactors = 0;
//
//        for(int i=2; i<A;i++){
//            if(A%i == 0){
//                noOfFactors++;
//                System.out.println("Not a Prime");
//                break;
//            }
//        }
//        if (noOfFactors ==0){
//            System.out.println("It's a Prime");
//        }



        for(int i=2; i*i<=A;i++){
            if(A%i == 0){
                ++noOfFactors;
                System.out.println("Not a Prime");
                break;
            }
        }
        if (noOfFactors == 0){
            System.out.println("It's a Prime");
        }

    }
}
