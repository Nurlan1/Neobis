import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner con= new Scanner(System.in);
        int n= con.nextInt();
        int [] a = new int[n];
        
        for (int i=0; i<n;i++){
            a[i]=con.nextInt();
            
        }
        for( int i=0; i<n;i++){
            int j=1;
            int sum=0;
            while(j<=a[i]/2){
                if(a[i]%j==0){
                    sum+=j;
                }
                j++;
                
            }
            if(sum==a[i]){
                System.out.println(a[i]+" eh perfeito");
            }else{
                System.out.println(a[i]+" nao eh perfeito");
            }
            
            
        }
    }
