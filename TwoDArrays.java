import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TwoDArrays {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
         int sum=0,x=0;
        ArrayList<Integer> li=new ArrayList<Integer>();
for(int q=0;q<4;q++)
{
    x=0;
    for(int z=0;z<4;z++)
        {
            sum=0;
            for(int k=z;k<z+3;k++)
                {
                        if(k == x+1)
                        {
                            sum+=(arr[q][k]+arr[q+2][k]+arr[q+1][k]);
                        }
                        else
                        {
                        sum+=(arr[q][k]+arr[q+2][k]);
                        }
                }
                x++;
                li.add(sum);
        }
}
Collections.sort(li);
System.out.println(li.get(li.size()-1));
        scanner.close();
    }
}
