import java.util.Scanner;

public class Container {
    public static void main(String[] args) {
        int n0 = 1;
        int n1 = 1;
        int n2;
        String name;
        for (int i = 3; i < 11; i++) {
            n2 = n0+n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;

        }
    }
}


