// Print all unique triplets...


public class PrintUniqueTriplets {
    public static void main(String[] args){
        int[] arr = {10,20,30};
        uniqueTriplets(arr);
    }

    static void uniqueTriplets(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                for(int k=j; k<arr.length; k++){
                    System.out.print("("+arr[i]+","+arr[j]+","+arr[k]+")");
                }
            }
            System.out.println();
        }
    }
}
