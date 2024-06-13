// To write a code to Extreme print in array..


public class ExtremePrintInArray {
    public static void main(String[] args){
        int[] arr = {12,32,34,343,23};
        extremePrint(arr);
    }

    static void extremePrint(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            if(start == end){
                System.out.println(arr[start]+" ");
            }else {
                System.out.print(arr[start]+" ");
                System.out.print(arr[end] + " ");
            }
            start++;
            end--;
        }
    }
}
