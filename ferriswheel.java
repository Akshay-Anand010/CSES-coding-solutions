import java.util.*;
public class ferriswheel{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int x=in.nextInt();
        int a[][]=new int[n+1][x+1];
        int w[]=new int[n];
        for(int i=0;i<n;i++)
           w[i]=in.nextInt();
           for(int i=1;i<=x;i++)
            a[0][i]=0;
           for(int i=0;i<=n;i++)
           a[i][0]=0;
           a[0][0]=1;
        for(int i=1;i<=n;i++)
        {
    for(int j=1;j<=x;j++)
    {
      if(w[i-1]<=j){
        a[i][j]=a[i-1][j-w[i-1]]+a[i-1][j];  
      } 
      else{
          a[i][j]=a[i-1][j];
      } 
    }
        }
        System.out.println(a[n][x]);
    }
}