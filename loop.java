public class loop {
    public static void main(String[] args){

       /*  int x;
        for (int i = 65; i <=90; i++) {
            for (int j = 65; j<=i ;j++) {
                x=j;
                System.out.print((char)j);
                System.out.print(" ");
                    
                }
                */
            int a=123;
            int org=a;
            int res=0;

            while(a>0){
                int digit=a%10;
                res=res+digit;
                a=a/10;
            }
            System.out.println(res);




            }
            
    }




