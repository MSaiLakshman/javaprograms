import java.util.*;
import java.util.Scanner;

class Large{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
     
        System.out.println(SumOfPrime(a,n));
    }
    public static int SumOfPrime(int[] input1, int input2)
    {
        int sum=0;
        int large=Integer.MIN_VALUE;
        boolean hasprime=false;
        for(int i=0;i<input2;i++)
        {
            if(isPrime(input1[i])){
                if(input1[i]>large)
                {
                    large=input1[i];
                }
                hasprime=true;
            }
            else
            {
                sum+=input1[i];
            }
        }
        if(hasprime)
        {
            sum-=large;
        }
        return sum;
    }
       static boolean isPrime(int n) {
    if (n <= 1)
        return false;
    if (n <= 3)
        return true;
    if (n % 2 == 0 || n % 3 == 0)
        return false;
    
    for (int i = 5; i * i <= n; i += 6) {
        if (n % i == 0 || n % (i + 2) == 0)
            return false;
    }
    
    return true;

    }
}