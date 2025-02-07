

class BankAccount{
    private int accountNumber;
    private double balance;
    private static String bankName;
    private static double interestRate;

    public BankAccount(int accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public static void setBankName(String bankName){
        BankAccount.bankName = bankName;
    }

    public static void setInterestRate(double interestRate){
        BankAccount.interestRate = interestRate;
    }

    public static String getBankName(){
        return bankName;
    }

    public static double getInterestRate(){
        return interestRate;
    }

    public void printDetails(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Interest Rate: " + interestRate);
    }
}

public class BankAccountTest{
    public static void main(String[] args){
        BankAccount.setBankName("SBI");
        BankAccount.setInterestRate(4.5);

        BankAccount account1 = new BankAccount(12345, 10000);
        BankAccount account2 = new BankAccount(54321, 20000);

        account1.printDetails();
        account2.printDetails();
    }
}

