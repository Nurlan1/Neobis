class Main{
    public static void main(String [] args){
        Scanner con= new Scanner(System.in);
        int q=con.nextInt();
        String [] res= new String[q];
        for(int j=0;j<q;j++){
        String a=con.next();
        int n=con.nextInt();
        int i=0;
        String b="";
        while(i<a.length()){
            
            int c=a.charAt(i)-n;
            if(c<'A'){
                b+=(char)('Z'+1-('A'-c));
            }else{
            b+=(char)c;}
            i++;
        }
        res[j]=b;
        }
        
        for (int i=0; i<q;i++){
            System.out.println(res[i]);
            
        }
        
        
    }
}
