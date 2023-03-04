import java.util.*;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float pn=0, nn=0, z=0;
        int n= sc.nextInt();
        List<Integer> arr= new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a= sc.nextInt();
            arr.add(a);
        }
        System.out.println(arr);

        for (int i = 0; i < n; i++) {
            if(arr.get(i)==0)
            {
                z++;
            }
            else if(arr.get(i)<0)
            {
                nn++;
            }
            else
            {
                pn++;
            }
        }

        float AvgP= pn/n;
        float AvgN= nn/n;
        float AvgZ= z/n;

        System.out.println(AvgP+"\n"+AvgN+"\n"+AvgZ);     
        
    }
}

