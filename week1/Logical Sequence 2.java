import java.util.*;
public class Main
{  
  public static void main(String[] args)
  {
    Scanner con = new Scanner(System.in);
    
    int y=con.nextInt();
    int n=con.nextInt();
    int j=y;
    for (int i=1;i<=n;i++){
        
        System.out.print(i);
        j--;
        if(j==0){
            System.out.println();
            j=y;
        }
        else{
            System.out.print(" ");
        }
        
    }
}  }

