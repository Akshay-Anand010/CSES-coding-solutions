import java.util.*;
public class missingno{
   
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n-1];
        for(int i=0;i<n-1;i++)
        a[i]=in.nextInt();
        Arrays.sort(a);
        int i=0;
        int ans=0;
        while(i<n-1){
            if(a[i]!=i+1){
                ans=i+1;
                break;
            }
         i++;
        }
       System.out.println(ans);
    }

}