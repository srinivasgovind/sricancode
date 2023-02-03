import java.util.Scanner;

// This Program help to find a number is perfect Number or not
// What is Perfect Number?
//  perfect number is a positive integer that is equal to the sum of its proper positive divisors (excluding the number itself). A positive proper divisor divides a number without leaving any remainder.
public class isPerfectNumber {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int calculatedSum =0 ;

        for(int i = 1; i<N ;i++){
            if( N % i == 0){
                calculatedSum +=i;
            }
        }
        if(calculatedSum == N){
            System.out.println("Perfect Number!");
        }
        else{
            System.out.println("Oops! Better Luck Next Time");
        }
    }
}
