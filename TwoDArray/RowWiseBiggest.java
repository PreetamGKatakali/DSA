package TwoDArray;
/**
 * this is finding the row wise biggest in the given matrix.
 */
public class RowWiseBiggest {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},
                     {4,21,6},
                     {7,8,9}
                    };
        int big=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(big<arr[i][j]){
                    big=arr[i][j];
                }
            }
            System.out.println(big);
            big=0;
        }
        
    }
}
