// Print all odd elements from the given array using recursion.

public class PrintOddNumbersUsingRecursion {
    public static void main(String[] args){
        int[] arr = {10,30,24,340,45,33,23};
        int index = 0;
        int size = arr.length;
        printAllOdd(arr,index,size);
    }

    static void printAllOdd(int[] arr, int index, int size){
        if(index == size){
            return;
        }

        if(arr[index] % 2 != 0){
            System.out.print(arr[index]+ " ");
        }

        printAllOdd(arr,index+1,size);
    }
}
