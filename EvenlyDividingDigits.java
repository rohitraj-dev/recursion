import java.util.*;
class EvenlyDividingDigits
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number : ");
        int num = sc.nextInt();

        System.out.println(evenlyDivides(num));
        sc.close();

    }
    static int evenlyDivides(int n) 
    {
        int number = n;
        int count = 0;
        while(number!=0)
        {
            int r = number % 10;
            if(n%r == 0)
            count++;
            number = number/10;
        }
        return count;
    }
}