public class FristPosandEndPos {
    public static void main(String[] args) {
        int[] arr={1,2,5,5,5,5,48,48,27};
        int x=5;
        int start=-1;
        int end=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                if(start==-1){
                    start=i;
                }
                end=i;
            }
        }
        System.out.println(start);
        System.out.println(end);
    }
}
