// Find minimum number in array....


public class MinNumInArr {
    public static void main(String[] args){
        int[] arr = {20,34,23,43,56,1,34,65};
        int result = minimumNumber(arr);
        System.out.println("Minimum element: "+result);
    }

    static int minimumNumber(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i =0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
