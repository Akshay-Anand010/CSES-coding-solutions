import java.util.*;
public class weirdalgo{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.print(n+" ");
        while(n!=1){
        if(n%2==0){
        System.out.print(n/2+" ");
        n=n/2;
        }
        else{
            System.out.print(n*3+1+" ");
            n=n*3+1;
        }
    }
    }
}