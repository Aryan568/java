import java.util.*;

public class ApplesOranges {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("House points-");
        int s= sc.nextInt();
        int t= sc.nextInt(); // s and t are starting and end points of house.
        System.out.println();
        System.out.println("Apple and Orange tree points-");
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println();
        System.out.println("Apples and Oranges dropped on land-");
        int m= sc.nextInt();
        int n= sc.nextInt();
        System.out.println();
        List<Integer> apples= new ArrayList<>();
        List<Integer> oranges= new ArrayList<>();
        System.out.println("Dropped apples distance from apple tree");

        for (int i = 0; i < m; i++) {
            int ad= sc.nextInt();  //distance of dropped apples from apple tree.
            apples.add(ad);
        }
        System.out.println();
        System.out.println("Dropped oranges distance from orange tree");

        for (int i = 0; i < n; i++) {
            int od= sc.nextInt();  //distance of dropped oranges from orange tree.
            oranges.add(od);
        }

        for (int i = 0; i < m; i++) {
            apples.set(i, apples.get(i)+a);
        }
    
        for(int i = 0; i < n; i++) {
            oranges.set(i, oranges.get(i)+b);
        }
        
        int ap=0, or=0;
        for (int i = 0; i < m; i++) {
            if(apples.get(i)>=s && apples.get(i)<=t)
            {
                ap++;
            }
        }
        
        for (int i = 0; i < n; i++) {
            if(oranges.get(i)>=s && oranges.get(i)<=t)
            {
                or++;
            }
        }
        System.out.println("Number of apples and oranges dropped in house area- "+ap+" "+or);
    }
}
