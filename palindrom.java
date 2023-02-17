import java.lang.reflect.Array;
import java.util.Arrays;

import org.w3c.dom.ls.LSException;

import java.util.*;

// public class palindrom {
//     static boolean isAnagram(String a, String b) {
        
//         char chr1[]= a.toLowerCase().toCharArray();
//         char chr2[]= b.toLowerCase().toCharArray();
    

//         Arrays.sort(chr1);
//         Arrays.sort(chr2);    
      
//         return Arrays.equals(chr1, chr2);
//      }

//      public static void main(String[] args) {
//         String a = "anagraam";
//         String b = "marganaa";
//         System.out.println(isAnagram(a, b));;
//      }

public class palindrom {

   // static boolean isAnagram(String a, String b) {
   //     char c1[]= a.toLowerCase().toCharArray();
   //     char c2[]= b.toLowerCase().toCharArray();
       
   //     for(int i=0; i<c1.length; i++)
   //     {
   //       for(int j=i+1; j<c1.length; j++)
   //       {
   //          char temp= 0;
   //          if(c1[i]>c1[j])
   //          {
   //             temp= c1[i];
   //             c1[i]= c1[j];
   //             c1[j]= temp;
   //          }
   //       }
   //       System.out.println(c1[i]);
   //     }
   // }

   public static void main(String[] args) {
   
       Scanner scan = new Scanner(System.in);
       String a = scan.next();
       String b = scan.next();
       scan.close();
       char c1[]= a.toLowerCase().toCharArray();
       char c2[]= b.toLowerCase().toCharArray();
       
       for(int i=0; i<c1.length; i++)
       {
         for(int j=i+1; j<c1.length; j++)
         {
            char temp= 0;
            if(c1[i]>c1[j])
            {
               temp= c1[i];
               c1[i]= c1[j];
               c1[j]= temp;
            }
         }
         System.out.print(c1[i]+" ");
       }
       System.out.println();
       for(int i=0; i<c2.length; i++)
        {
            for(int j=i+1; j<c2.length; j++)
            {
                char temp= 0;
                if(c2[i]>c2[j])
                {
                    temp= c2[i];
                    c2
                    [i]= c2[j];
                    c2[j]= temp;
                }
            }
            System.out.print(c2[i]+" ");
        }
        if(c1.toString().compareTo(c2))
        {
          System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
       //boolean ret = isAnagram(a, b);
       //System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
   }

 
    
}
