package TwoDArray;
/**
 * this program is printing the matrix in the sprical 
 * we will take i as iterastions 
 * k --> starting 0 row 
 * l--> starting 0 colum
 * 
 * R --> number of rows 
 * C--> number of columes 
 */
public class SpiralMatrix {
    static void spiral(int R,int C,int[][] arr){
        int i,k=0,l=0;
        /**
         * k --> starting of the row
         * l--> starig of the colume 
         * */ 

         while(k<R && l<C){
            for(i=l;i<R;i++){
                System.out.print(arr[k][i]+" ");
            }
            k++;
            for(i=k;i<C;i++){
                System.out.print(arr[i][C-1]+" ");
            }
            C--;
            if(k<R){
                for(i=C-1;i>=l;--i){
                    System.out.print(arr[R-1][i]+" ");
                }
                R--;
            }
            if(l<C){
                for(i=R-1;i>=k;--i){
                    System.out.print(arr[i][l]+" ");
                }
                l++;
            }
         }
    }
    public static void main(String[] args) {
        int[][] arr={{ 1, 2, 3, 4 },
                     { 5, 6, 7, 8 },
                     { 9, 10, 11, 12 },
                     { 13, 14, 15, 16 }};
        int R=arr.length;     //row of the matrix
        int C=arr[0].length;  //colume of the matrix
        spiral(R,C,arr);
    }
}
