import java.util.Scanner;
public class day3 {
        public static void main(String[] args){

            //check for odd or even
            Scanner in =new Scanner(System.in);
           /*  int b=in.nextInt();
            if(b%2==0){
                System.out.println("even");

            }
            else{
                System.out.println("odd");
            }

            //positive /negative/zero

            int a=in.nextInt();
            if(a<0){
                System.out.println("negative");
            }
            else if(a==0){
                System.out.println("zero");
            }
            else{
                System.out.println("positive");
            }

            //greatest of two numbers
            int no1=in.nextInt();
            int no2=in.nextInt();
            if(no1<no2)
            {
                System.out.println("no 1 is greater");
            
            }
            else{
                System.out.println("no 2 is greater");
            }*/

            //vowel
          /*  char z=in.next().charAt(0);
            switch(z){
                case 'a':
                   System.out.println("vowel"); 
                  break;
                case 'e':
                System.out.println("vowel");       
                 break;
                case 'i':
                    System.out.println("vowel"); 
                    break;
                case 'o':
                    System.out.println("vowel");  
                    break;   
                case 'u' :
                System.out.println("vowel"); 
                break;
        
               default:
                System.out.println("consonent");
               }
            //print no 1 to n
            int n=in.nextInt();
            for (int i = 1; i <=n; i++) {
                System.out.println(i);
            }*/

            //sum of first n natural no
            /* 
            int no3=in.nextInt();
            int sum=0;
            for (int i = 0; i <=no3; i++) {
                sum=sum+i;
            }
            System.out.println(sum);
             */


             //multiplication table of 5
          /*   int x=in.nextInt();
             for (int i = 0; i <=10; i++) {
                System.out.println(i*x);
                
             }

             //check no is divisble by 5&11
             int y=in.nextInt();
             if(y%5==0&&y%11==0){
                System.out.println("no is divisble by 5 & 11");

             }
             else{
                System.out.println("not divisble by 5 & 11");
             }
*/

             //covert float into int 
             float z=in.nextFloat();
            int no4=(int)z;
            System.out.println("float"+z);
            System.out.println("int "+no4);


 
            }
}