import java.util.Scanner;

//This Code Just Prints the Multiplication Table for the Given N.
public class MultiplicationTable {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        int tableNo =sc.nextInt();

        for(int i = 1 ;i <= 10 ;i++){
            System.out.println(tableNo +" * "+ i + " = "+(tableNo *i));
        }
    }
}
