import java.util.*;
public class Main
{  
  public static void main(String[] args)
  {
    Scanner con = new Scanner(System.in);
    
    int n=con.nextInt();
    double [] r=new double [n];
 
    for (int i=0;i<n;i++){
        
        r[i]+=(con.nextDouble()*2);
        r[i]+=(con.nextDouble()*3);
        r[i]+=(con.nextDouble()*5);
    }
    for(int i=0;i<n;i++){
    System.out.println(Math.round(r[i]*1.0)/10.0);}
}  }
