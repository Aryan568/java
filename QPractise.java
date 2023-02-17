import java.util.Scanner;

public class QPractise {
    // public static float calAverage(Float a, float b, float c) {
    //     float avg= (a+b+c)/3;
    //     return avg;
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     float a = sc.nextInt();
    //     float b = sc.nextInt();
    //     float c = sc.nextInt();
    //     float avg = calAverage(a, b, c);
    //     System.out.println(avg);
    // }

    // public static int oddSum(int n) {
    //     int sum=0;
    //     for(int i=1; i<=n; i++)
    //     {
    //         if(i%2!=0)
    //         {
    //             sum=sum+i;
    //         }
           
    //     }
    //     System.out.println(sum);
    //     return sum;
    // }
    // public static void main(String[] args) {
    //     Scanner sc= new Scanner(System.in);
    //     int n= sc.nextInt();
    //     oddSum(n);    
    // }
    // public static int valPower(int n, int x) {
    //     int value=1;
    //     for(int i=1; i<=n; i++)
    //     {
    //         value= value*x;
    //     }
    //     System.out.println(value);
    //     return value;
    // }
    // public static void main(String[] args) {
    //     Scanner sc= new Scanner(System.in);
    //     int x= sc.nextInt();
    //     int n= sc.nextInt();
    //     valPower(n, x);
    // }

    //Array
    // public static void main(String[] args) {
        
    //     Scanner sc= new Scanner(System.in);
    //     int size=sc.nextInt();
    //     String names[]= new String[size];
    //     for(int i=0; i<size; i++)
    //     {
    //         names[i]= sc.next();
    //     }
    //     for(int i=0; i<size; i++)
    //     {
    //         System.out.println("name " + (i+1) +" is : " + names[i]);
    //     }
    // }

    // public static void main(String[] args) {
    //     int numbers[]={3,6,7,2,9};
    //     int max=numbers[0], min=numbers[0];
    //     for(int i=1; i<numbers.length; i++)
    //     {
    //         if(numbers[i]>max)
    //         {
    //             max=numbers[i];
    //         }
    //         if(numbers[i]<min)
    //         {
    //             min=numbers[i];
    //         }
    //     }
    //     System.out.println("Maximum Number of an array is "+max);
    //     System.out.println("Minimum Number of an array is "+min);
    // }

    // Spiral for of Matrix
    // public static void main(String[] args) {
        
    //     Scanner sc= new Scanner(System.in);
    //     int n= sc.nextInt();
    //     int m= sc.nextInt();
    //     int num[][]=new int[n][m];
    //     System.out.println("*************************************");

    //     for(int i=0; i<n; i++)
    //     {
    //         for(int j=0; j<m; j++)
    //         {
    //             num[i][j]=sc.nextInt();
    //         }
    //     }
    //     for(int i=0; i<n; i++)
    //     {
    //         for(int j=0; j<m; j++)
    //         {
    //             System.out.print(num[i][j]+" ");
    //         }
    //         System.out.println();
    //     }
        
    //     System.out.println("*************************************");

    //     System.out.println("Spiral form of given matrix is: ");

    //     int rs=0, re=n-1, cs=0, ce=m-1; //rs_row_start,re_row_end

    //     while(rs<=re && cs<=ce)
    //     {
    //         for(int i=cs; i<=ce; i++)
    //         {
    //             System.out.print(num[rs][i]+" ");
    //         }
    //         rs++;

    //         for(int i=rs; i<=re; i++)
    //         {
    //             System.out.print(num[i][ce]+" ");
    //         }
    //         ce--;

    //         for(int i=ce; i>=cs; i--)
    //         {
    //             System.out.print(num[re][i]+" ");
    //         }
    //         re--;

    //         for(int i=re; i>=rs; i--)
    //         {
    //             System.out.print(num[i][cs]+" ");
    //         }
    //         cs++;
    //     }
    // }
    
    // Snake form of Matrix
    // public static void main(String[] args) {
        
    //     Scanner sc= new Scanner(System.in);
    //     int n= sc.nextInt();
    //     int m= sc.nextInt();
    //     int num[][]=new int[n][m];
    //     System.out.println("*************************************");

    //     for(int i=0; i<n; i++)
    //     {
    //         for(int j=0; j<m; j++)
    //         {
    //             num[i][j]=sc.nextInt();
    //         }
    //     }
    //     for(int i=0; i<n; i++)
    //     {
    //         for(int j=0; j<m; j++)
    //         {
    //             System.out.print(num[i][j]+" ");
    //         }
    //         System.out.println();
    //     }
        
    //     System.out.println("*************************************");

    //     System.out.println("Snake form of given matrix is: ");

    //     int rs=0, cs=0, ce=m-1; //rs_row_start,re_row_end

    //     while(cs<=ce)
    //     {
    //         for(int i=cs; i<=ce; i++)
    //         {
    //             System.out.print(num[rs][i]+" ");
    //         }
    //         rs++;

    //         for(int i=ce; i>=cs; i--)
    //         {
    //             System.out.print(num[rs][i]+" ");
    //         }
    //         rs++;
    //     }
    // }

    // Transpose of Matrix
    // public static void main(String[] args) {
        
    //     Scanner sc= new Scanner(System.in);
    //     int n= sc.nextInt();
    //     int m= sc.nextInt();
    //     int num[][]=new int[n][m];
    //     System.out.println("*************************************");

    //     for(int i=0; i<n; i++)
    //     {
    //         for(int j=0; j<m; j++)
    //         {
    //             num[i][j]=sc.nextInt();
    //         }
    //     }
    //     System.out.println("*************************************");
    //     System.out.println("*************************************");
    //     for(int i=0; i<m; i++)
    //     {
    //         for(int j=0; j<n; j++)
    //         {
    //             System.out.print(num[j][i]+" ");
    //         }
    //         System.out.println();
    //     }
        
    //     System.out.println("*************************************");
    // }

    // public static void main(String[] args) {
    //     Scanner sc= new Scanner(System.in);
    //     int size= sc.nextInt();
    //     String name[]=new String[size];
    //     int total=0;
    //     for(int i=0; i<size; i++)
    //     {
    //         name[i]=sc.next();
    //         total+= name[i].length(); 
    //     }
    //     System.out.println(total);
    // }

    // public static void main(String args[]) {
    //     Scanner sc = new Scanner (System.in);
    //     String str = sc.next();
    //     String result = "";
   
   
    //     for(int i=0; i<str.length(); i++) {
    //       if(str.charAt(i) == 'e') {
    //         result += 'i';
    //       } else {
    //         result += str.charAt(i);
    //       }
    //     }
   
   
    //     System.out.println(result);
    //   }
   
    // public static void main(String []argh){
    //     Scanner sc = new Scanner(System.in);
    //     String str[]=new String[3];

    //     for(int i=0; i<3; i++)
    //     {
    //         str[i] = sc.nextLine();
    //     }
    //     for(int i=0; i<3; i++)
    //     {
    //         System.out.println(i+1 +" "+str[i]);
    //     }
    //     System.out.println();
    // }


   
    // public static void main(String[] args) {
    //     Scanner scan = new Scanner(System.in);
    //     String s = scan.next();
    //     int k = scan.nextInt();
    //     scan.close();

    //     for(int i=0; i<=s.length()-k; i++)
    //     {
            
    //         String s1= s.substring(i,i+k);
    //         System.out.println(s1);
    //     }
      
       
    // }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        String arr[]= s.split(",|'");
        for(int i=0; i<arr.length(); i++)
        {
            sSystem.out.println(arr[i]);
        }
        
    }

}
