
import java.util.*;

public class arraylistss {
    public static void main(String[] args) {
              Scanner sc= new Scanner(System.in);
              int n= sc.nextInt();
              ArrayList<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();

              for (int i = 0; i < n; i++) {
                    int d= sc.nextInt();
                    ArrayList<Integer> lists= new ArrayList<>();
                    for (int j = 0; j < d; j++) {
                        int ns= sc.nextInt();
                        lists.add(ns);
                    }
                    list.add(lists);
              }

              int q= sc.nextInt();
              for (int i = 0; i < q; i++) {
                    int x= sc.nextInt();
                    int y= sc.nextInt();
                    try {
                        int queries= list.get(x-1).get(y-1);
                        System.out.println(queries);  
                    } catch (Exception e) {
                        System.out.println("ERROR!");
                    }
              }
    }    
}
