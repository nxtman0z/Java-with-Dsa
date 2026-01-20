public class access {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.username = "manoj";
        ba.password = "bhak";

        ba.setPassword("hgcg");
        
    }
}
class BankAccount{
    public Strig username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}
