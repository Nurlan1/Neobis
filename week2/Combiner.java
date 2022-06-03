import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner con= new Scanner(System.in);
        int n=con.nextInt();
        String [] res=new String[n];
        for(int k=0;k<n;k++){
        String s1=con.next();
        String s2=con.next();
        
        String b= "";
        int s1l=s1.length();
        int s2l=s2.length();
        int i=0;
        int j=0;
        while(i+j<s1l+s2l){
            if(i<s1l){
                b+=s1.charAt(i);
                i++;
            }
            if(j<s2l){
                b+=s2.charAt(j);
                j++;
            }
        }
        res[k]=b;}
        for(int i=0;i<n;i++){
            System.out.println(res[i]);
        }
    }
}
