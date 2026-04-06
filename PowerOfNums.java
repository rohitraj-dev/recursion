import java.util.*;
class PowerOfNums
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); 
         
        System.out.println("enter a number : ");
        int num = sc .nextInt();
        
        System.out.println(reverseExponentiation(num));
        
    }
    public static int reverseExponentiation(int n)
    {
        if(n == 0)
            return 10;
        return pow(n,n);
    }
    public static int pow(int a, int b)
    {
        if(b==0)
            return 1; 
        int call = pow(a, b/2);
        if(b%2 == 0)
            return call * call;
        else
            return call * call * a;
    }
}