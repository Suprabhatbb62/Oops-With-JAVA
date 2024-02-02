
public class AccessModifiers {
    public static void main(String args[]) {
        BankAccount bank = new BankAccount();
        bank.username = "Suprabhat";
        System.out.println(bank.username);
        // pass has acces specifiers private, can't be access from outside
        // Error: The field BankAccount.password is not visible
        // bank.password = "567aaa";

        //private class's variable can't be accessible but functions can work;
        bank.setPassword("567");
        // System.out.println(bank.password);   #not work
    } 
}

class BankAccount {
    public String username;
    private String password;

    void setPassword(String newpass) {
        password = newpass;
    }
} 
