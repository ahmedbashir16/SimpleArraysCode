import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("hello");
        // array of primitives
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 233;
        arr[3] = 543;
        arr[4] = 3;
        // [23, 45, 233, 543, 3]
        System.out.println(arr[4]);

        // input using for loops
        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
            arr[i] = in.nextInt();
        }


        }

}


