package JavaString;
/**
 * This is program sawping of letter of first and last letters.
 */
public class StringLettersSwap {
    public static void main(String[] args) {
        String str="preetam is good boy";
        char[] res=str.toCharArray();
        int count=0;
        for(int i=0;i<res.length;i++){
            if(res[i]==' '){
                char temp=res[i-1];
                res[i-1]=res[i-count];
                res[i-count]=temp;
                count=0;
            }
            else if(i==res.length-1){
                char temp=res[i];
                res[i]=res[i-count];
                res[i-count]=temp;
            }
            else{
                count++;
            }
        }
        System.out.println(new String(res));
        // char[] res=str.toCharArray();
        // int count=0;
        // for(int i=0;i<res.length;i++){
        //     if(i==res.length-1){
        //         char temp=res[i-count];
        //         res[i-count]=res[count];
        //         res[count]=temp;
        //     }
        //     else{
        //         count++;
        //     }
        // }
        // System.out.println(Arrays.toString(res));
    }
}
