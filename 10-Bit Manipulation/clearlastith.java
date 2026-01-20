public class clearlastith {
    public static int clearLastithBit(int n,int i){
        int bitmask = (~0)<<i;
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clearLastithBit(15,2));
    }
}
