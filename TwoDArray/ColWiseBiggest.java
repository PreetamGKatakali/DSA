package TwoDArray;
/**
 * this progarm is about the printing colume wise biggest 
 */
public class ColWiseBiggest {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},
                     {4,5,6},
                     {7,8,9}                
                    };
                    int big=0;
        for(int j=0;j<arr[0].length;j++){
            for(int i=0;i<arr.length;i++){
                if(big<arr[i][j]){
                    big=arr[i][j];
                }
            }
            System.out.println(big);
            big=0;
        }
    }
}
