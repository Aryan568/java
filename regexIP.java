import java.util.Scanner;
import java.util.regex.*;
public class regexIP {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex{
    String number= "\\b([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
    String pattern= number+"."+number+"."+number+"."+number;
}
