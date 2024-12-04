import java.util.*;
public class Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Pattern");
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Reverse Pattern");
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = n-i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Straight and Reverse Pattern");
        System.out.println();

        for (int i = 0; i < (n+1)/2; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < (n-1)/2; i++) {
            for (int j = (n-1)/2-i; j >0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Box Pattern");
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Box Pattern");
        System.out.println();

        
    }
}