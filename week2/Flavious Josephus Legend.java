import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner con= new Scanner(System.in);
        int t=con.nextInt();
        int [] res= new int[t];
        for(int i=0;i<t;i++){
        int n=con.nextInt();
        int k=con.nextInt();
        res[i]=josephus(n, k);}
    for(int i=0;i<t;i++){
        System.out.printf("Case %d: %d\n",i+1,res[i]);
    }
  }
 
  static int josephus(int n, int k)
    {
        if (n == 1)
            return 1;
        else
            return (josephus(n - 1, k) + k - 1) % n + 1;
    }
}
