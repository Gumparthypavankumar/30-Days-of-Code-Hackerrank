import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BinaryNumbers {
     static int i=0,count=0;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int temp=0;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int binary[]=new int[32];
        while(n != 0)
        {
            binary[i]=n%2;
            n=n/2;
            i++;
        }
        for(int j:binary)
        {
            if(j == 1)
            {
            count++;
            if(count >temp)
            {
            temp=count;
            }
            }
            else
            count=0;
        }
        System.out.println(temp);
        scanner.close();
    }
}
