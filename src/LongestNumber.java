import java.util.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class LongestNumber {
    static void printLargest(Vector<String> arr)
    {
   Collections.sort(arr, new Comparator<String>()
    {

        @Override public int compare(String X, String Y)
        {


            String XY = X + Y;


            String YX = Y + X;


            return XY.compareTo(YX) > 0 ? -1 : 1;
        }
    });

    Iterator it = arr.iterator();

        while (it.hasNext())
                System.out.print(it.next());
}





    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        Vector<String> arr;
        arr = new Vector<>();



        for (int i=0;i<size;i++) {
            arr.add(scan.next());
        }

        printLargest(arr);

    }
}


