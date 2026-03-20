import java.util.*;
class gcd
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter num1 : ");
        int num1 = sc.nextInt();

        System.out.print("enter num2 : ");
        int num2 = sc.nextInt();

        System.out.println(gcd(num1,num2));
    }
    public static int gcd(int a, int b)
    {
        if(a == 0)
            return b;
        return gcd(b%a, a);
    }
}