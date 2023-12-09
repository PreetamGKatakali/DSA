package TwoDArray;
/**
 * this is a transpose of the matrix 
 * we are taking the new 2D array to store the martix which is in the 
 * res[i][j]=arr[j][i];
 */
public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},
                     {4,5,6},
                     {7,8,9}
                    };
        int[][] res=new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                res[i][j]=arr[j][i];
            }
        }
        
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
