import java.util.*;
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
          /*   int a=123;
            int org=a;
            int res=0;

            while(a>0){
                int digit=a%10;
                res=res+digit;
                a=a/10;
            }
            System.out.println(res);*/
        /* Scanner in= new Scanner(System.in);
         System.out.println("enter the size of array");
         int n=in.nextInt();
         int[] arr=new int[n];
         System.out.println("enter the value of array");
         for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
         }

        System.out.println("the array is");
         
         for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
         }
         System.out.println();
         System.out.println("Reverse Array Is");

         for (int i = arr.length-1; i>=0; i--) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //highest
        System.out.println("highest");
        int key=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=key){
            key=arr[i];
            }
        }
        System.out.print(key);
        System.out.println();

        System.out.println("second highest");
        int no1=arr[0];
        int no2=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(no1<arr[i]){
                no2=no1;
            no1=arr[i];
            }
        }
        System.out.print(no2);*/
        
       // array sum
         int[] arr2={1,2,3,4,5};
         int[]arr3={5,6,7,8,9};

         int []sum=new int [arr2.length];


         for (int i = 0; i < sum.length; i++) {
             sum[i]=arr2[i]+arr3[i];
         }
         for (int j = 0; j < sum.length; j++) {
            
        
         System.out.println(sum[j]);
        
        }

        //common element
        int []a1={1,2,3,4,9};
        int []a2={1,6,7,8,9};     
        int count=0;
        for (int i = 0; i < a2.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                if(a1[i]==a2[j]){ 
                count++;
                }
                
            }
        }
        System.out.println(count);

         }
            
    }




