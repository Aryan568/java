import java.util.*;

public class ArrayReverse {
    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);
        Integer arr[]={1,2,3,4,5,6};
    
        System.out.println("Original Array is "+Arrays.toString(arr) );

        Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.toString(arr));

        // List<Integer> lst= new ArrayList<>();
        // for (int i = 0; i < 5; i++) {
        //     int a= sc.nextInt();
        //     lst.add(a);    
        // }  
        // System.out.println(lst);
        // int max= Collections.max(lst);
        // System.out.println(max);
    }
}
