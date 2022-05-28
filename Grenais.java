import java.util.*;
public class Main
{  
  public static void main(String[] args)
  {
    Scanner con = new Scanner(System.in);
    int i=0;
    int inter1=0;
    int grem1=0;
    int tie=0;
    do{
    int inter=con.nextInt();
    int grem=con.nextInt();
    if (inter>grem){
        inter1++;
    }
    else if(inter==grem){
        tie++;
    }else{
        grem1++;
    }
    i++;
    System.out.println("Novo grenal (1-sim 2-nao)");
    }while(con.nextInt()!=2);
    
    System.out.println(i+" grenais");
    System.out.println("Inter:"+inter1);
    System.out.println("Gremio:"+grem1);
    System.out.println("Empates:"+tie);
    if(inter1>grem1) System.out.println("Inter venceu mais");
    else if (inter1<grem1) System.out.println("Gremio venceu mais");
    else System.out.println("Não houve vencedor");

}  }
