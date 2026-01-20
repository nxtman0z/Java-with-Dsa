public class kadanes {
    public static void kadanesAlgorithim(int numbers[]){
        int currentsum =0;
        int maximumsum = Integer.MIN_VALUE;

        for(int i =0;i<numbers.length;i++){
            currentsum += numbers[i];
            if(currentsum < 0){
                currentsum =0;
            }
            maximumsum = Math.max(currentsum , maximumsum);
        }
        System.out.println("our maximum subarray sum is :"+maximumsum);
    }
    public static void main(String[] args) {
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanesAlgorithim(numbers);
    }

}
