import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner con = new Scanner(System.in);
        int h=con.nextInt();
        int m=con.nextInt();
        int h1=con.nextInt();
        int m1=con.nextInt();
        int r;
        r = ((h1*60)+m1) - ((h*60)+m);
        if(r<=0) r += 24*60;
        System.out.println("O JOGO DUROU "+r/60+" HORA(S) E "+r%60+" MINUTO(S)");

    }  }