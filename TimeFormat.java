import java.util.*;
import java.util.regex.*;

public class TimeFormat {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
       
        int h= Integer.valueOf(s.substring(0,2));
        String remain= s.substring(2,8);
        String a= "";
        
        if(s.contains("AM"))
        {
            if(h==12 && s.contains("AM"))
            {
                a= "00"+remain;
            }
            else
            {
                a= s.substring(0,8);
            }
        }
        
        if(s.contains("PM"))
        {
            if(h==12 && s.contains("PM"))
            {
                a= "12"+remain;
            }
            else
            {
                a= String.valueOf(h+12)+remain;
            }
        }
        System.out.println(a);
    }
}
