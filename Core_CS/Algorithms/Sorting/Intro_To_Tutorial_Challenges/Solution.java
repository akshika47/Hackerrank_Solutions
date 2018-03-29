import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        int size = s.nextInt();
        s.nextLine();
        
        int j=0;
        int array[] = new int[size];
        int c = size;
        while(size>0)
        {
            size--;
            array[j] = s.nextInt();
            j++;
        }
        
        for(int i=0;i<c;i++)
        {
           
                       
            if(array[i] == n){
                System.out.println(i);
            }
        }
    }
}