//import scanner
import java.util.*;
//public class here
public class Main {

    public static int[] pascalRow(int n) {
        if (n == 0) return new int[]{1};

        int[] prev = pascalRow(n - 1);
        int[] curr = new int[n + 1];

        curr[0] = 1;
        curr[n] = 1;

        for (int i = 1; i < n; i++) {
            curr[i] = prev[i - 1] + prev[i];
        }

        return curr;
    }
//public static void main here
    public static void main(String[] args) {
        System.out.println("Which line of pascals triangle would you like to print?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] row = pascalRow(n);
//for loop
        for (int x : row) {
//system print ln
            System.out.print(x + " ");
        }
    }
}

