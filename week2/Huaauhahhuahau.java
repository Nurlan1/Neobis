import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner con= new Scanner(System.in);
        
        String s1=con.next();
        StringBuilder s2 =new StringBuilder();
        int j=s1.length();
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
                s2.append(s1.charAt(i));
        }
        
        if(s2.toString().equals((s2.reverse().toString())))
            System.out.println("S");
         else System.out.println("N");
        
    }
}
