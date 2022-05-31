import java.util.*;
public class Main
{  
  public static void main(String[] args)
  {
    for(int i=0;i<=20;i=i+2){
        for(int j=1;j<=3;j++){
            double a=Double.parseDouble(i/10+"."+i%10);
            if(a%1==0){
              System.out.println("I="+(int)a+" J="+(int)(j+a));  
            }else{
            System.out.println("I="+a+" J="+(j+a));
        }}
    }
}  }
