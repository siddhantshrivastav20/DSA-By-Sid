public class PrintArrayUsingRecursion {
    public static void main(String[] args){
        int[] arr = {23,23,43,445,3434,5454,34,3};
        int size = arr.length;
        int index = 0;
        printArray(arr, size, index);
    }

    static void printArray(int[] arr, int size, int index){
        if(index == size){
            return;
        }
        System.out.print(arr[index] + " ");
        printArray(arr, size, index+1);
    }
}
