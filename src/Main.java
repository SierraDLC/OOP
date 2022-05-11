
public class Main {
    public static void main(String[] args) {

        BankAccount Wapo = new BankAccount("Wapo", 5000);
        Wapo.withdraw(100);

        
        BankAccount Lapo = new BankAccount("Lapo", 300);
        Lapo.deposit(100);

        
        Wapo.accountDetails();
        
        Lapo.accountDetails();


        
        Product gas = new Product(4.0, 10, "Gallon of gas");
        
        gas.printProduct();
        
        gas.totalCost();



    }
}