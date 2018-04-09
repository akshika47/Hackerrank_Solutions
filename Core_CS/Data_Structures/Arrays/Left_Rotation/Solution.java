import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scan.nextLine().split(" ");

        int n = Integer.parseInt(nd[0].trim());

        int d = Integer.parseInt(nd[1].trim());

        int[] a = new int[n];
        int [] temp = new int[n];
        String[] aItems = scan.nextLine().split(" ");

        for (int aItr = 0; aItr < n; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr].trim());
            a[aItr] = aItem;
        }

        for(int k=0;k<n;k++)
        {
            temp [k] = a[d++];
            if(d==n)
            {
                d = 0;
            }
        }
        for (int i =0;i<n-1;i++)
        {
            System.out.print(temp[i]+" ");
        }
            System.out.print(temp[n-1]);
    }
}