import java.util.*;

public class arrlist {


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        ArrayList<Integer> list= new ArrayList<>();
        for(int i= 0; i<N; i++)
        {
            int L= sc.nextInt();
            list.add(L);
        }
        
        int Q= sc.nextInt();
        for (int i = 0; i < Q; i++)
        {
            String s= sc.next();
            if(s.equals("Insert"))
            {
                int x= sc.nextInt();
                int y= sc.nextInt();
                list.add(x,y);
            }
              if(s.equals("Delete"))
            {
                int x= sc.nextInt();
                list.remove(x);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}

