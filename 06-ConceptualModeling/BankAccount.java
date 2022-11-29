public class BankAccount {

    //attributes

    private String accNumber;
    private double balance = 0;
    private String currency;

    //getters and setters

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    //methods

    public void deposit(double money){
        this.balance = this.balance + money;
    }

    public void withdraw(double money){
        if(money > 500){
            System.out.println("You cannot withdraw more then 500PLN");
        } else if(balance < money){
            System.out.println("Error");
        } else {
            this.balance = this.balance - money;
        }
    }

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount();

        acc1.deposit(500);
        System.out.println(acc1.getBalance());
        acc1.deposit(200);
        System.out.println(acc1.getBalance());
        acc1.withdraw(300);
        System.out.println(acc1.getBalance());
        acc1.withdraw(22);
        System.out.println(acc1.getBalance());
        acc1.withdraw(501);

    }
}
