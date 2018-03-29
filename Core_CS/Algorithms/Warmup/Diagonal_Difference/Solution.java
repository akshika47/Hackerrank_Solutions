import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[][] a = new int[N][N];
        for(int i = 0 ; i<N ; i++)           
        {
            s.nextLine();
            for(int j = 0 ; j<N ; j++)
                {
                a[i][j] = s.nextInt();
            }
            
        }       
        int sum1 = 0;
        int sum2 = 0;
        int j = 0;
        for(int i = N-1 ; i>-1 ; i--)
            {
                sum1 += +a[i][i];
                sum2 +=  a[i][j];
                j++;     
        }
        sum1 -= sum2;            
        if(sum1<0)
            sum1 *= (-1);           
         System.out.print(sum1);
    }
   
}