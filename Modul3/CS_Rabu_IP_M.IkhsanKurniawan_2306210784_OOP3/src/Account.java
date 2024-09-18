public class Account {
    private double accountNumber;
    private double balance;
    private Bank bank;
    private AccountType accountType;

    Account(int accountNumber, double balance, Bank bank, AccountType accountType){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.bank = bank;
        this.accountType = accountType;
    }

    public double getAccountNumber(){
        return accountNumber;
    }
    public Bank getBank(){
        return bank;
    }
    public double getBalance(){
        return balance;
    }
    public AccountType getAccountType(){
        return accountType;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void deposit(double amount){
        if (amount < 0){
            System.out.println("error");
        }else {
            this.balance = this.balance + amount;
        }
    }

    public void withdraw(double amount){
        if (balance>= amount){
            this.balance = this.balance - amount;

        } else {
            System.out.println("error");
        }
    }

    public void addInterest(){
        this.balance = this.balance + getBank().getInterestRate();
    }

    public void showDetail(){
        System.out.println("Account Number :" + this.accountNumber);
        System.out.println("Balance :" + this.balance);
        System.out.println("Bank Code :" + this.getBank().getCode());
        System.out.println("Account Type :" + this.accountType);
    }
}
