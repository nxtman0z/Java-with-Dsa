public class friendspairing {
    public static int friendsPairing(int n){
        if(n == 1 || n ==2){
            return n;
        }
        //choice single
        int single = friendsPairing(n-1);
        //choice pair
        int pair = friendsPairing(n-2);
        int pairways = (n-1) * pair;
        int totalways = single +pairways;
        return totalways;

    }
    public static void main(String[] args) {
        System.out.println(friendsPairing(1));
    }
}
