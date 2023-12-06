public class ArrayIsSubsetOfAnotherArray {
    public static void main(String[] args) {
        int[] arr1={10, 5, 2, 23, 19};
        int[] arr2={19, 5, 3};
        int count=0;
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr2[i]==arr1[j]){
                    count++;
                }
            }
        }
        System.out.println(count==arr2.length?"true":"flase");
    }
}
