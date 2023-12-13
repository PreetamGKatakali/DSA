package Stack;

public class RainWaterTrapping {
    public static void main(String[] args) {
        int[] arr={3,0,0,2,0,4}; // o/p : 10 units of water
        int[] MaxL=new int[arr.length];
        int[] MaxR=new int[arr.length];
        MaxL[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            MaxL[i]=Math.max(MaxL[i-1],arr[i]);
        }
        
        MaxR[MaxR.length-1]=arr[arr.length-1];
        for(int i=MaxR.length-2;i>=0;i--){
            MaxR[i]=Math.max(MaxR[i+1],arr[i]);
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=(Math.min(MaxL[i],MaxR[i]))-arr[i];
        }
        System.out.println(sum);
        

    }
    
}
