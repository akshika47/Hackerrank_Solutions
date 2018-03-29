import java.math.BigInteger;
import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    static HashMap<Integer, BigInteger> mem = new HashMap<Integer, BigInteger>();
    static int i, j, k;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        i = s.nextInt();
        j = s.nextInt();
        k = s.nextInt();
        System.out.printf(String.valueOf(Fib(k)));
    }

    public static BigInteger Fib(int k)
    {
        if(mem.containsKey(k))
        {
            return mem.get(k);
        }

        if(k==1)
        {
            return new BigInteger(String.valueOf(i));
        }
        if(k==2)
        {
            return new BigInteger(String.valueOf(j));
        }

        BigInteger Val = Fib(k-1).pow(2).add(Fib(k - 2));
        mem.put(k,Val);
        return Val;
    }
}
