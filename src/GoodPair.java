import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

//Prints the Pair positions for A[i]+A[j]=K
// Can also able to solve with HashSet
public class GoodPair {

    public static void main(String[] args) {
        ArrayList<Integer> inputList = new ArrayList<>();
        inputList.add(1);
        inputList.add(2);
        inputList.add(3);
        inputList.add(4);
        int targetValue = 7;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < inputList.size(); i++) {
            int a = inputList.get(i);
            int b = targetValue - a;
            if (map.containsKey(b)) {
                System.out.println("Pos "+i + " and Pos " + map.get(b));
            } else {
                map.put(a, i);
            }
        }
    }
}
