import java.util.*;

public class function {
    public static int calProduct(int a, int b) {
        int Product = a*b;
        return Product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        int Product= calProduct(a, b);
        System.out.println("Product of 2 numbers is: " + Product );
    }
}
