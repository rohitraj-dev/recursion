import java.util.*;
class PreInPost
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        pip(3);
        sc.close();
    }
    public static void pip(int n)
    {
        if(n == 0)
            return;
        System.out.print("Pre : "+n+" ");
        pip(n-1);
        System.out.print("In : "+n+" ");
        pip(n-1);
        System.out.print("Post : "+n+" ");
    }
}