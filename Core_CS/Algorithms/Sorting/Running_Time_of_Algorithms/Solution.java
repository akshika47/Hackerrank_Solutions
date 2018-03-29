import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
      
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        s.nextLine();
        int a[] = new int[size];
        for(int i=0;i<size;i++){
            a[i] = s.nextInt();
        }
        
        int count=0;
        for(int i=1;i<a.length;i++){
            int x = a[i];
            int j = i;
            while(j>0 && x<a[j-1]){
                a[j] = a[j-1];
                j--;
                count++;
            }
            a[j] = x;            
        }
        System.out.println(count);
    }
}