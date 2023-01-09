
public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = {1, 3 , 5 ,6 , 8 ,9};
        int key = 4;
        int low = 0;
        int high = arr.length;
        boolean flag = true;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==key){
                System.out.println("Element found in the array");
                flag = false;
            }
            if(arr[mid]<key){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        if(flag)
        {
            System.out.println(" Element not found in the array");
        }

    }
}
