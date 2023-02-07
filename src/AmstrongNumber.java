import java.util.Scanner;

//This Program prints amstrong numbers for the given range [1,N]
// Amstrong Number 153 = (1*1*1) + (5*5*5) + (3*3*3)
public class AmstrongNumber {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
         int N = sc.nextInt();

         for(int i=1;i<=N;i++){

             if(i==1){
                 System.out.println(i);
             }
             else if(i>1 && i<=152){
                 continue;
             }
             else{
                 int x = i;
                 int tempSum =0;
                 while(x>0){

                     tempSum += (x%10) * (x%10) *(x%10);
                     x = x/10;
                 }
                 if(tempSum == i){
                     System.out.println(i);
                 }
             }
         }

    }
}
