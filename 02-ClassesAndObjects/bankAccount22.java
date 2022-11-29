public class bankAccount22 {
    
    //atributes
    String accountNum;
    double accountBalanceEUR;
    double accountBalancePLN;
    double accountBalanceUSD;
    String bankName;

    //methods
    public void displayBalance()
    {
        System.out.println("Your balance on PLN account is: " + accountBalancePLN + " PLN");
        System.out.println("Your balance on EUR account is: " + accountBalanceEUR + " EUR");
        System.out.println("Your balance on USD account is: " + accountBalanceUSD + " USD");
    }

    public void bankName()
    {
        System.out.println("Name of the bank: " + bankName);
    }

    public void accountNum()
    {
        System.out.println("Account number: " + accountNum);
    }

    public static void main(String args[]){
        bankAccount22 acc1 = new bankAccount22();
        System.out.println();

        acc1.accountBalanceEUR = 848.98;
        acc1.accountBalancePLN = 234.41;
        acc1.accountBalanceUSD = 10;
        acc1.accountNum = "1234 0000 5146 5629";
        acc1.bankName = "Santander";

        acc1.bankName();
        acc1.accountNum();
        acc1.displayBalance();
        System.out.println();

    }
    

}
