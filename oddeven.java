public class oddeven {
    public static void main(String[] args) {
       String str="hello";
       String str2="hihi";

       for (int i = 0; i < str.length(); i++) {
        for (int j = 0; j < str2.length(); j++) {
            
        
            if (str.charAt(i)==str2.charAt(j)){
                System.out.println(str.charAt(i)+" is same");
            }
        }
       }


       String str3="racecar";
       String str4="r";
       int count=0;
    for (int i = 0; i < str3.length(); i++) {
        if(str3.charAt(i)==str4.charAt(0)){
            count++;
        }
        
        
    }
    System.out.println("no times "+count);
    String str8=" ";

    char []arr=str8.toCharArray();
    for (int i = 0; i < arr.length; i++) {
        
        
    }









    }

    
}

     