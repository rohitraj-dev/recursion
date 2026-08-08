import java.util.*;
class SumofNatNums
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number : ");
        int num = sc.nextInt();
        System.out.println(findSum(num));
    }
    public static int findSum(int n)
    {
        if(n == 1)
            return 1;
        return n + findSum(n-1);
    }
}