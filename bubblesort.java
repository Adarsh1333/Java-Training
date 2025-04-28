public class bubblesort {
    public static void bubble(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

        }
        for (int i : arr) {
            System.out.println(i);
        }

    }

    public static void linear(int[] arr, int target) {
        for (int j = 0; j < arr.length; j++) {

            if (arr[j] == target) {
                System.out.println("found at index" + j);
            }
            
        }
    }


    public static int binary(int[]arr,int target,int low ,int high){
        
        if(low>high){
        return -1;
        }
        int mid=(int)((low+high)/2);
        if(arr[mid]==target){
            System.out.println("Found at index "+mid);

        }
        if(arr[mid]<target){
            binary(arr,target,mid+1,high);
        }
        else{
            binary(arr, target, low, mid-1);
        }
        return mid;
        



    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 24, 2 };
        int low=arr[0];
        int high=arr[arr.length-1];
        //bubble(arr);
        int target = 24;
        //linear(arr, target);
        
        int no=binary(arr,target,low ,high);
        if(no==-1){
            System.out.println("not found ");
        }
    }

}
