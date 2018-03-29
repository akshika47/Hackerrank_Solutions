import java.io.*;
import java.util.*;

public class Solution {

    public static void insertionSortPart2(int[] ar)
        
    {   
        for(int i=0;i<ar.length;i++)
        {
            int x = ar[i];
            int j=i;
            
            while(j>0 && ar[j-1] > x)
                {
                ar[j] = ar[j-1];
                j=j-1;
               }
            ar[j]=x;
            if(i>0){
            printArray(ar);
            }
        }
         
    }  
    
    
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertionSortPart2(ar);    
                    
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}