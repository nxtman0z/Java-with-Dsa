public class even {
    public static void oddandeven(int n){
        int bitmask =1;
        if((n & bitmask) == 0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }
    public static void main(String[] args) {
        oddandeven(3);
        oddandeven(5);
        oddandeven(4);
    }
}
