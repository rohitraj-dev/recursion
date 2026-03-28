import java.util.*;
class nthStair
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number of stairs : ");
        int n = sc.nextInt();
        System.out.println(countWays(n));
        sc.close();
    }
    public static int countWays(int n)
    {
        if(n<=2) return n;
        return countWays(n-1) + countWays(n-2);
    }
}
