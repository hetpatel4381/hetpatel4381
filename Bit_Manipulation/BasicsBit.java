package Bit_Manipulation;
import java.util.Scanner;

public class BasicsBit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = s.nextInt();
        int j = s.nextInt();
        int k = s.nextInt();
        int m = s.nextInt();

        //preparing mask for bitmanipulation
        int onMask = (1 << i);
        int offMask = ~(1 << j);
        int toggleMask = (1 << k);
        int checkMask = (1 << m);

        //printing the output as we needed
        System.out.println(n | onMask);
        System.out.println(n & offMask);
        System.out.println(n ^ toggleMask);
        System.out.println((n & checkMask) == 0 ? false : true);
    }
}
