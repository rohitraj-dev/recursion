import java.util.*;
class TowerOfHanoi
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        hanoi(5, 'A', 'B', 'C');
        sc.close();
    }
    public static void hanoi(int n, char a, char b, char c)
    {
        if(n == 0)
            return;
        hanoi(n-1, a, c, b);
        System.out.println(a+" -> "+c);
        hanoi(n-1, b, a, c);
    }
}