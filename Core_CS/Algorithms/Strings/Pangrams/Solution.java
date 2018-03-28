import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String test = s.nextLine();
        int a[] = new int[26];
        for(int i=0;i<a.length;i++)
        {
            a[i] = 0;
        }
        if(test.length()<26)
        {
            System.out.println("not pangram");
        }
        else
        {
            test = test.toLowerCase();
            for(int i=0;i<test.length();i++)
            {
                
                switch(test.charAt(i)){
                    case 'a':
                    a[0] = 1;
                    break;
                    case 'b':
                    a[1] = 1;
                    break;
                    case 'c':
                    a[2] = 1;
                    break; 
                    case 'd':
                    a[3] = 1;
                    break; 
                    case 'e':
                    a[4] = 1;
                    break; 
                    case 'f':
                    a[5] = 1;
                    break; 
                    case 'g':
                    a[6] = 1;
                    break; 
                    case 'h':
                    a[7] = 1;
                    break; 
                    case 'i':
                    a[8] = 1;
                    break; 
                    case 'j':
                    a[9] = 1;
                    break; 
                    case 'k':
                    a[10] = 1;
                    break; 
                    
                    case 'l':
                    a[11] = 1;
                    break; 
                    case 'm':
                    a[12] = 1;
                    break; 
                    case 'n':
                    a[13] = 1;
                    break; 
                    case 'o':
                    a[14] = 1;
                    break; 
                    case 'p':
                    a[15] = 1;
                    break; 
                    case 'q':
                    a[16] = 1;
                    break; 
                    case 'r':
                    a[17] = 1;
                    break; 
                    case 's':
                    a[18] = 1;
                    break; 
                    case 't':
                    a[19] = 1;
                    break; 
                    case 'u':
                    a[20] = 1;
                    break; 
                    case 'v':
                    a[21] = 1;
                    break; 
                    case 'w':
                    a[22] = 1;
                    break; 
                    case 'x':
                    a[23] = 1;
                    break; 
                    case 'y':
                    a[24] = 1;
                    break; 
                    case 'z':
                    a[25] = 1;
                    break; 
                }
            }
            int count=0;
            for(int i=0;i<26;i++)
                
            {
                
                if(a[i]==0){
                    count++;
                }
            }
            
            
            if(count!=0)
            { 
                
                System.out.println("not pangram");
                
            }
            
            else{ 
                
                System.out.println("pangram");
                
            }
        }
        
        
        
    }
}