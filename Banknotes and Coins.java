import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner con = new Scanner(System.in);
        double n1 = con.nextDouble();
        int dec=(int)(n1%1*100);
        int n=(int)n1;
        System.out.println("NOTAS:");
        System.out.println(n/100+" nota(s) de R$ 100.00");
        n=n%100;
        System.out.println(n/50+" nota(s) de R$ 50.00");
        n=n%50;
        System.out.println(n/20+" nota(s) de R$ 20.00");
        n=n%20;
        System.out.println(n/10+" nota(s) de R$ 10.00");
        n=n%10;
        System.out.println(n/5+" nota(s) de R$ 5.00");
        n=n%5;
        System.out.println(n/2+" nota(s) de R$ 2.00");
        n=n%2;
        System.out.println("MOEDAS:");

        System.out.println(n/1+" moeda(s) de R$ 1.00");
        System.out.println(dec/50+" moeda(s) de R$ 0.50");
        dec%=50;
        System.out.println(dec/25+" moeda(s) de R$ 0.25");
        dec%=25;
        System.out.println(dec/10+" moeda(s) de R$ 0.10");
        dec%=10;
        System.out.println(dec/5+" moeda(s) de R$ 0.05");
        dec%=5;
        System.out.println(dec/1+" moeda(s) de R$ 0.01");
    }  }