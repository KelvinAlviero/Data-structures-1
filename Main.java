public class Main {
    public static void main(String[] args) {
        //Methods
        CreditCard card1 =  new CreditCard("Kelvin","Wollonging","Cool account name",200,2000);
        System.out.print("Welcome " + card1.getCustomer() + " to bank " + card1.getBank());
        System.out.print("\nYour account name: "+ card1.getAccount()+ " currently has $"+ card1.getBalance()+ " and a limit of$"+ card1.getLimit());
        System.out.print("\nransaction has been made, your new balance is"+ card1.charge(200));
        card1.makePayment(300);



    }
}