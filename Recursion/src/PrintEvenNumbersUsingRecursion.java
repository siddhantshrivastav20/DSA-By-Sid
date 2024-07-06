// Print all odd numbers from an array using recursion.

public class PrintEvenNumbersUsingRecursion {
    public static void main(String[] args){
        int[] arr = {12,23,34,45,34,33};
        int index = 0;
        int size = arr.length;
        printOdds(arr,size,index);
    }

    static void printOdds(int[] arr, int size, int index){
        if(index == size){
            return;
        }

        if(arr[index] %2 == 0){
            System.out.print(arr[index] + " ");
        }

        printOdds(arr, size, index+1);
    }
}
