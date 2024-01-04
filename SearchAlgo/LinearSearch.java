package SearchAlgo;

public class LinearSearch {
    static int search(int[] arr,int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return  -1;
    }
    public static void main(String[] args) {
        int[] arr={1,24,57,96,7,5,2};
        int x=7;
        int res=search(arr, x);
        System.out.println((res!=-1)?"The element found :"+res:"Element is not found");
        

    }
}
