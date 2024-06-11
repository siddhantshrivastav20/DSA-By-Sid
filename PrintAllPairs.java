// Print all pairs of an array

public class PrintAllPairs {
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50};
        allPairs(arr);
    }

    static void allPairs(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print("("+arr[i] +","+ arr[j]+")");
            }
            System.out.println();
        }
    }
}
