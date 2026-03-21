import java.util.*;
class Reverse
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");
        int num = sc.nextInt();
        System.out.println(ans(num,0));
    }
    public static int ans(int n, int r)
    {
        if(n == 0)
            return r;
        return ans(n/10, r*10 + n%10);
    }
}