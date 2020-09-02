package demo;
import java.util.Scanner;
public class D11{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int s=a+1*b; System.out.print(s+" ");
        for(int j=2,k=2;j<=n;j++,k=k*2)
        {
            s=s+k*b;
            System.out.print(s+" ");
        } System.out.println();
        }
        in.close();
    }
}