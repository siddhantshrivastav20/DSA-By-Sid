public class PrintColumnByElement2D {
    public static void main(String[] args){
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        columnWise(arr);
    }
    static void columnWise(int[][] arr){
        for(int row=0; row<arr.length; row++){
            for(int col =0; col<arr[row].length; col++){
                System.out.print(arr[col][row]+ " ");
            }
            System.out.println();
        }
    }
}
