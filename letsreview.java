import java.io.*;
import java.util.*;

public class letsreview {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        while(in.hasNext())
        {
            String string=in.next();
            for(int i=0;i<string.length();i++)
            {
                if(i%2 == 0)
                {
                    System.out.print(string.charAt(i));
                }
            }
            System.out.print(" ");
            for(int i=0;i<string.length();i++)
            {
           if(i%2 != 0)
                {
                    System.out.print(string.charAt(i));
                }
            }
            System.out.println();
        }
    }
}

