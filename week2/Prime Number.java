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
            int j=2;
            int sum=0;
            while(j<a[i]){
                if(a[i]%j==0){
                    sum=1;
                    break;
                }
                j++;
                
            }
            if(sum==0){
                System.out.println(a[i]+" eh primo");
            }else{
                System.out.println(a[i]+" nao eh primo");
            }
            
            
        }
    }
}
