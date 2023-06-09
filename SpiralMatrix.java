import java.util.*;

public class SpiralMatrix {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int num[][]=new int[n][m];
        System.out.println("*************************************");

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                num[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("*************************************");

        System.out.println("Spiral form of given matrix is: ");

        int rs=0, re=n-1, cs=0, ce=m-1; //rs_row_start,re_row_end

        while(rs<=re && cs<=ce)
        {
            for(int i=cs; i<=ce && rs<=re && cs<=ce; i++)
            {
                System.out.print(num[rs][i]+" ");
            }
            rs++;

            for(int i=rs; i<=re && rs<=re && cs<=ce; i++)
            {
                System.out.print(num[i][ce]+" ");
            }
            ce--;

            for(int i=ce; i>=cs && rs<=re && cs<=ce; i--)
            {
                System.out.print(num[re][i]+" ");
            }
            re--;

            for(int i=re; i>=rs && rs<=re && cs<=ce; i--)
            {
                System.out.print(num[i][cs]+" ");
            }
            cs++;
        }
    }
}
