public class diamond {
    public static void main(String[] args){
        for (int i = 0; i < 10; i++) {
         for (int j = i; j < 10; j++) {
            System.out.print(" ");
        }
        for (int k = 0; k <=10; k++) {
            System.out.print("*");
        }
        for (int z = 0; z < i; z++) {
            System.out.print("*");
        }
        System.out.println();
        }
        
        for (int i = 0; i <=10; i++)
          {
         for (int j = 0; j < i; j++)
          {
         System.out.print(" ");
          }
                for (int k = i; k<10; k++) {
                    System.out.print("*");
                }
               for (int z = i; z <=10; z++) {
                System.out.print("*");
               }
                System.out.println();
            }
    }
                
}
