package Bit_Manipulation;
import java.util.Scanner;

public class rsbm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mask = n & (-n);

        System.out.println(mask);
    }    
}
