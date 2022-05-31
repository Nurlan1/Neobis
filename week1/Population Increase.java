import java.util.*;
public class Main
{  
  public static void main(String[] args)
  {
    Scanner con = new Scanner(System.in);
    int n=con.nextInt();
    int []ar=new int[n];
    for(int i=0;i<n;i++){
    int PA=con.nextInt();
    int PB=con.nextInt();
    double G1=con.nextDouble();
    double G2=con.nextDouble();
        int j=0;
        do{
            j++;
            PA=PA+(int)((PA*G1)/100);
            PB=PB+(int)((PB*G2)/100);
        }while(PA<=PB && j<101);
        ar[i]=j;
    }
    for(int i=0;i<n;i++){
        if(ar[i]<101){ System.out.println((int)ar[i]+" anos.");}
    else{
        System.out.println("Mais de 1 seculo.");
    }}
}  }
