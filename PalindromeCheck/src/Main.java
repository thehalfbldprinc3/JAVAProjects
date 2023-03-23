import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int num=sc.nextInt();
        int reverse =0;
        int tempNum=num;

        while(num>0)
        {
            int remainder =num%10;

            reverse =reverse*10+remainder;

            num=num/10;
        }
        if(reverse==tempNum) System.out.println("given number is a palindrome");
        else System.out.println("given number is not a palindrome");
    }
}