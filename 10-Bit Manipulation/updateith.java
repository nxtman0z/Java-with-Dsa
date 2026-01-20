public class updateith {
    public static int clearithBit(int n,int i){
        int bitmask = ~(1<<i);
        return n & bitmask;

    }
    public static int updateBit(int n ,int i,int newbit){
        n = clearithBit(n,i);
        int BitMask = newbit<<i;
        return n | BitMask;
    }
    public static void main(String[] args) {
        System.out.println(updateBit(10,2,1));
    }
}
