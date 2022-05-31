import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner con = new Scanner(System.in);
        double [] ar=new double[3];
        for(int i=0;i<3;i++){
            ar[i] = con.nextDouble(); }
        Arrays.sort(ar);
        double A=ar[2];
        double B=ar[1];
        double C=ar[0];
        if (A >= B + C){
            System.out.println("NAO FORMA TRIANGULO");}
        else{
            if (A*A == B*B + C*C){
                System.out.println("TRIANGULO RETANGULO");}
            if (A*A > B*B + C*C){
                System.out.println("TRIANGULO OBTUSANGULO");}
            if (A*A < B*B + C*C){
                System.out.println("TRIANGULO ACUTANGULO");}
            if (A==B && B==C){
                System.out.println("TRIANGULO EQUILATERO");}
            if((A==B&&B!=C)||(B==C&&B!=A)|| (C==A&&B!=C)) {
                System.out.println("TRIANGULO ISOSCELES");}
        }
    }  }
