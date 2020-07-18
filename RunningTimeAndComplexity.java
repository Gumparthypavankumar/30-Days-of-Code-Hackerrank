import java.io.*;
import java.util.*;
import java.lang.*;

public class RunningTimeAndComplexity {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-- > 0)
        {
            int n=in.nextInt();
            boolean isprime=true,notOne=true;
            if(n == 1)
            {
                System.out.println("Not prime");
                notOne=false;
                // break;
            }
            if(notOne)
            {
                for(int i=2;i<=Math.sqrt(n);i++)
                {
                    if(n%i == 0)
                    {
                        System.out.println("Not prime");
                        isprime=false;
                        break;
                    }
                }
                if(isprime)
                    System.out.println("Prime");
            }
        }
    }
}
