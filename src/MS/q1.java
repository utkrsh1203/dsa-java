package MS;

public class q1 {
    public int f(int[] arr){
        int left[] = new int[arr.length/2];
        int right[] = new int[arr.length/2];

        for(int i = 0; i< arr.length; ){
            left[i/2] = arr[i];
            i++;
            right[i/2] = arr[i];
            i++;
        }
        int i = 1;
        int cnt = 0;
        int last = right[0];
        while(i< left.length){
            if(left[i] == last){
                last = right[i];
            }else{
                i++;
                cnt++;
            }
        }
        
        return cnt;
    }
}
