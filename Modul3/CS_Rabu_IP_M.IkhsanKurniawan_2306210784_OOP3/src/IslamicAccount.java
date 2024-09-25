public class IslamicAccount extends Account {
    private double mudhorobahRate;

    public IslamicAccount(int accountNumber, double balance, Bank bank, AccountType accountType, double mudhorobahRate){
        super(accountNumber,balance,bank,accountType);
        this.mudhorobahRate = mudhorobahRate;
    }

    public double getMudhorobahRate(){
        return mudhorobahRate;
    }

    public void addInterest(){
        super.setBalance(super.getBalance() + mudhorobahRate);
    }

    public void showDetail(){
        System.out.println("Account Number :" + super.getAccountNumber());
        System.out.println("Balance :" + super.getBalance());
        System.out.println("Bank Code :" + super.getBank().getCode());
        System.out.println("Account Type :" + super.getAccountType());
        System.out.println("Mudhorobah Rate :" + this.mudhorobahRate);
    }
}
