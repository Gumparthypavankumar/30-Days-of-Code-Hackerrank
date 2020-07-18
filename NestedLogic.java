import java.io.*;
import java.util.*;

public class NestedLogic {
    static int fine;
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        String actuall_return[]=in.nextLine().split(" ");
        int actuall_date=Integer.parseInt(actuall_return[0]);
        int actuall_month=Integer.parseInt(actuall_return[1]);
        int actuall_year=Integer.parseInt(actuall_return[2]);


        String expected_return[]=in.nextLine().split(" ");
        int expected_date=Integer.parseInt(expected_return[0]);
        int expected_month=Integer.parseInt(expected_return[1]);
        int expected_year=Integer.parseInt(expected_return[2]);

        if(actuall_date<expected_date && actuall_year < expected_year)
            fine=0;
        else if(actuall_date>expected_date && actuall_month == expected_month && actuall_year == expected_year)
        fine=15 * (actuall_date - expected_date);
        else if(actuall_month > expected_month && actuall_year == expected_year)
        fine=500 * (actuall_month - expected_month);
        else if(actuall_year > expected_year)
        fine=10000;

        System.out.println(fine);
    }
}
