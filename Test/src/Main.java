import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int m1,m2,m3;


        String str=sc.next();

        char ch=str.charAt(0);
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
        int avg=(m1+m2+m3)/3;

        System.out.println(ch);
        System.out.println(avg);
    }

}