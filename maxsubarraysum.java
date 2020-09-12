import java.util.*;
public class maxsubarraysum{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=in.nextInt();
        List<Integer> l=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
         for(int j=i;j<n;j++){
             int p=i;
             int sum=0;
           while(p<=j){
            sum+=a[p];
            p++;
           }
           l.add(sum);
         }   
        }
    System.out.println(Collections.max(l));
    }
}