public class tiling {
    public static int tilingProblem(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        //choice
        //vertical choice
        int vertical = tilingProblem(n-1);
        //horizontaly choice
        int horizontal= tilingProblem(n-2);
        //total ways
        int totalways = vertical + horizontal;
        return totalways;
    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(4));
    }
}
