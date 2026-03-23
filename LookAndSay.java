import java.util.*;
class LookAndSay
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number n : ");
        int n = sc.nextInt();
        System.out.println(countAndSay(n));
        sc.close();
    }
    public static String countAndSay(int n)
    {
        if(n == 1)
            return "1";
        String s = countAndSay(n-1) + "#";
        String ans = "";
        int i=0, j=0;
        while(j < s.length())
        {
            if(s.charAt(i) == s.charAt(j))
                j++;
            else
            {
                int freq = j-i;
                ans += freq;
                ans += s.charAt(i);
                i = j;
            }
        }
        return ans;
    }
}