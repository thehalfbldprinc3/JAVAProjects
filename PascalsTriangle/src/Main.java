import java.util.Scanner;

class PascalTri
{
    long factCalc(int a)
    {
        long fact=1;
        for(int i =1;i<=a;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    long combCalc(int r, int n)
    {
        //nCr=n!/(n-r)!xr!
        long nCr=factCalc(n)/(factCalc((n-r))*factCalc(r));
        return nCr;
    }
    long[] PsclTri(int indx)
    {
        long[] Coeffs=new long[indx+1];
        for(int i =0;i<=indx;i++)
        {
            Coeffs[i]=combCalc(i,indx);
        }
        return Coeffs;
    }
}
public class Main
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the index of the power: ");
        int index= sc.nextInt();
        PascalTri Pst=new PascalTri();
        long[] Coeffes=new long[index+1];
        Coeffes=Pst.PsclTri(index);
        System.out.print("{ ");
        for(int i=0;i<Coeffes.length;i++)
        {
            System.out.print(Coeffes[i]+" ");
        }
        System.out.print("}");
    }
}