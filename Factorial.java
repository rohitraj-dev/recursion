import java.util.*;
class Factorial
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the value of n : ");
        int n = sc.nextInt();
    }
    public static int fact(int n)
    {
        //int fact = 1;
        if(n==0 || n==1) 
            return 1;
        int ans = n * fact(n-1);
        return ans;
    }
}