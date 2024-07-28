// Print SubArrays Using Recursion..

public class PrintAllSubArrays {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        printSubArray(arr);
    }

    static void printSubArray_All(int[] arr, int start, int end){
        if(end == arr.length){
            return;
        }
        for(int i=start; i<=end; i++){
            System.out.print(arr[i]);
        }
        System.out.println();

        printSubArray_All(arr,start,end+1);
    }

    static void printSubArray(int[] arr){
        for(int start =0; start<arr.length; start++){
            int end  = start;
            printSubArray_All(arr,start,end);
        }
    }
}
