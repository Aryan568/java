import java.util.*;

public class ArrayRoatation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        List<Integer> list= new ArrayList<>();

            int n= sc.nextInt();
            int d= sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a= sc.nextInt();
            list.add(a);
        }
        List<Integer> lst= new ArrayList<>();
        for (int i = d; i < n; i++) {
            lst.add(list.get(i));
        }
        for (int i = 0; i < d; i++) {
            lst.add(list.get(i));
        }
        
        System.out.println(lst);

       }
}
