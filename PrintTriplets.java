public class PrintTriplets {
    public static void main(String[] args){
        int[] arr = {12,23,34,45,45,3,4};
        printAllTriplets(arr);
    }

    static void printAllTriplets(int[] arr){
        int countTriplets = 0;
        for(int i =0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                for(int k=0; k<arr.length; k++){
                    System.out.print("("+arr[i]+","+arr[j]+","+arr[j]+")");
                    countTriplets++;
                }
                System.out.println();
            }
        }

        System.out.println("Total triplets: "+ countTriplets);
    }
}
