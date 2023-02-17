
public class StarP {
    static void rectangle(){
        int r=4, c=5, i, j;
        for(i=1; i<=r; i++)
        {
            for(j=1; j<=c; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        } 
    }
    static void hollow_rectangle(){
        int r=4, c=5, i, j;
        System.out.println();
          for(i=1; i<=r; i++)
          {
                for(j=1; j<=c; j++)
                {
                    if(i==r||j==c||i==1||j==1)
                    {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
          }

    }
    static void right_half_pyramid(){
        int r=4, i, j;
        System.out.println();
          for(i=1; i<=r; i++)
          {
                for(j=1; j<=i; j++)
                {
                    System.out.print("*"); 
                }
                System.out.println();
          }

    }
    static void left_half_pyramid(){
        int r=4, i, j;
        System.out.println();
        for(i=1; i<=r; i++)
        {
              for(j=1; j<=r-i; j++)
              {
                  System.out.print(" ");      
              }
              for(j=1; j<=i; j++)
              {
                  System.out.print("*");   
              }
              System.out.println();
        }

    }
    static void right_half_inverted_pyramid(){
        int r=4, i, j;
        System.out.println();
          for(i=0; i<=r; i++)
          {
                for(j=1; j<=r-i; j++)
                {
                    System.out.print("*");
                }
                for(j=1; j<=i; j++)
                {
                    System.out.print(" ");
                }           
                System.out.println();
          }
    }
    static void left_half_inverted_pyramid(){
        int r=5, c=5, i, j;
        System.out.println();
          for(i=1; i<=r; i++)
          {
                for(j=1; j<=c; j++)
                {
                    if(i>j)
                    {
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
                System.out.println();
          }
    }
    public static void main(String[] args) {
        rectangle();
        hollow_rectangle();
        right_half_pyramid();
        left_half_pyramid();
        right_half_inverted_pyramid();
        left_half_inverted_pyramid();        
    }
}
