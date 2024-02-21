public class CreditCard {
    private String Customer ;
    private String bank ;
    private String account;
    private int limit;
    private double balance ;


    public CreditCard(String Customer_set, String bank_set, String account_set, int limit_set, double balance_set) {
        Customer = Customer_set;
        bank = bank_set;
        account = account_set;
        limit = limit_set;
        balance = balance_set;
    }
    public String getCustomer(){return Customer;}
    public String getBank() {return bank;}
    public String getAccount() {return account;}
    public int getLimit() {return limit;}
    public double getBalance() {return balance;}
    public boolean charge(double price) {return price <= limit;}
    public void makePayment(double amount) {System.out.println("You have paid $" + amount);}

    }

