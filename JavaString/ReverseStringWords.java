package JavaString;

public class ReverseStringWords {
    public static void main(String[] args) {
        String str="my name is preetam";
        String revString="";
        String currentString="";
        char[] res=str.toCharArray();
        for(int i=0;i<res.length;i++){
            if(res[i]==' '){
                revString=currentString+" "+revString;
                currentString="";
            }
            else{
                currentString+=res[i];
            }
        }
        revString=currentString+" "+revString;
        System.out.println(revString);

    }
}
