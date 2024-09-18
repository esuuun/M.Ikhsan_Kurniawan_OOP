public class ConventionalAccount extends Account {
    private double credit;
    private double creditInterestRate;

    public ConventionalAccount(int accountNumber, double balance, Bank bank, AccountType accountType, double creditInterestRate){
        super(accountNumber,balance,bank,accountType);
        this.creditInterestRate = creditInterestRate;
        this.credit = 0;
    }

    public double getCredit(){
        return  credit;
    }
    public void setCredit(double credit){
        this.credit = credit;
    }

    public void PayCredit(){
        if(super.getBalance() > credit) {
            super.setBalance(getBalance() - credit);
            credit = 0;
        }
        else {
            System.out.println("error");
        }
    }
    public void addCredit(double amount){
        if(amount > 0) {
            this.credit = this.credit + (amount * this.creditInterestRate / 100);
        }
        else {
            System.out.println("error");
        }
    }

    public void addCredit(double amount, double discountRate){
        if(amount > 0) {

            this.credit = this.credit + (((amount * this.creditInterestRate) - discountRate) / 100);
        }
        else {
            System.out.println("error");
        }
    }

    public void showDetail(){
        System.out.println("Account Number :" + super.getAccountNumber());
        System.out.println("Balance :" + super.getBalance());
        System.out.println("Bank Code :" + super.getBank().getCode());
        System.out.println("Account Type :" + super.getAccountType());
        System.out.println("Credit :" + this.getCredit());
        System.out.println("Credit Interest Rate :" + this.creditInterestRate);
    }
}
