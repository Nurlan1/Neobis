import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner con= new Scanner(System.in);
         int i=con.nextInt();
         for(int j=0;j<i;j++){
        int n=con.nextInt();
        System.out.printf("Fib(%d) = %d\n",n,fib(n));}
    }
    public static long fib( int n){
        long [] fib=new long [n+2]; 
    fib[0] = 0;
    fib[1] = 1;
    for (int i = 2; i <= n; i++)
      fib[i] = fib[i-1] + fib[i-2];
    return fib[n];
    }
}
