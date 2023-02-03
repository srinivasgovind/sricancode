import java.util.Scanner;


//Prints sum of Natural Numbers for the Given Input N
// N value will be take from the User
public class SumOfNaturalNumbers {

    public static void main(String[] args){

        //Brute Force Approach
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int totalCount = 0;
        for(int i =1 ; i<=n ; i++){
            totalCount += i;
        }
        System.out.println(totalCount);

        // Can use sum of n natural numbers formula
        // totalCount = n * (n+1) /2


    }
}
