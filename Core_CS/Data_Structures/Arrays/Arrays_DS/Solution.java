import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
         int size =  s.nextInt();
        s.nextLine();
        int a[] = new int[size];
        for(int i=0 ;i<size;i++)
        {

            a[i] = s.nextInt();
        }
        

        for(int i=size-1;i>0;i--)
        {

            System.out.print(a[i]+" ");
        }
        System.out.println(a[0]);
    }
}
