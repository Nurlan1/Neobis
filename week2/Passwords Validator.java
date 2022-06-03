import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner con= new Scanner(System.in);
        while(con.hasNextLine()){
        String s=con.nextLine();
        int a=0;
            int b=0;
            int c=0;
            int d=0;
        if(s.length()>=6 && s.length()<=32){
            
            for(int i=0;i<s.length();i++)
            {
             if(!Character.isLetterOrDigit(s.charAt(i))) {
                 a=1;}
              
            
            if(Character.isLowerCase(s.charAt(i))){
                b=1;
            }
            if(Character.isUpperCase(s.charAt(i))){
                c=1;
            }
            if(Character.isDigit(s.charAt(i))){
                d=1;
            }
            }
        }else{
            a=1;
        }
        if(a==0&&b==1&&c==1&&d==1){
            System.out.println("Senha valida.");
        }
        else{
            System.out.println("Senha invalida.");
        }
        }
        
    }
}
