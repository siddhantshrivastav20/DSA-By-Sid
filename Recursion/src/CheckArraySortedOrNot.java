public class CheckArraySortedOrNot {
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50};
        int index = 1;
        System.out.println(arraySortedOrNot(arr,index));
    }

    static boolean arraySortedOrNot(int[] arr, int index){
        if(arr.length == 1){
            return true;
        }
        if(index == arr.length){
            return true;
        }
        if(arr[index] > arr[index-1]){
             return  arraySortedOrNot(arr, index+1);
        }else {
            return false;
        }
    }
}
