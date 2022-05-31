import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner con = new Scanner(System.in);
        double [][] ar=new double[12][12];
        double s=0.0;
        int c=con.nextInt();
        char o=con.next().charAt(0);;
        for(int i=0;i<12;i++){
            for(int j=0;j<12;j++){
                ar[i][j] = con.nextDouble();
                if(j==c){
                    s+=ar[i][j];
                }
            } }
        if(o=='S'){
            System.out.printf("%.1f\n",s);
        }
        else if(o=='M'){
            System.out.printf("%.1f\n",s/12.0);
        }
    }  }
