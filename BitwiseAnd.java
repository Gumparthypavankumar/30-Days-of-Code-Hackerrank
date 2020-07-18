import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BitwiseAnd {

    static void finding_max(int n,int k)
        {
        int a[]=new int[n+1];
        for(int i=1;i<=n;i++)
            a[i]=i;
        int max=Integer.MIN_VALUE,res;
        for(int i=1;i<=n;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                res=i&j;
                if(res>max && res<k)
                max=res;
            }
        }
        System.out.println(max);
        }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            finding_max(n,k);
        }
        scanner.close();
    }
}
