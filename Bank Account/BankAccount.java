class BankAccount {
    private Double checking;
    private Double savings;
    private static Integer NumberOfAccounts = 0; // total number of accounts in bank
    private static Double TotalAmmount = 0.0;// total ammount of money in bank

    // when you have a constructor with arguments you can no longer call the class(
    // BankAccount = new BankAccount()) without the arguments
    // if the constructor is not explicitly decladed an empty one is implicidly
    // included under the hood
    // Now to be able to call the emplty constructor you need to create a zero
    // argument constuctor
    public BankAccount() {
        NumberOfAccounts++;
        this.checking = 0.0;
        this.savings = 0.0;

    }

    // with this you can call BankAccount = new BankAccount() in your test file
    // Default constructor
    public BankAccount(Double checking, Double savings) {
        this.checking = checking;
        this.savings = savings;
        NumberOfAccounts++;
        TotalAmmount += checking + savings;

    }

    public Double getCheckingBalance() {

        return this.checking;
    }

    // public void setCheckingBalance(Double balance){
    // this.checking = balance;
    // }
    public Double getSavingsBalance() {
        return this.savings;
    }
    // public void setSavingsBalance(Double savings){
    // this.savings = savings;
    // }

    public void CheckingDeposit(Double deposit) {
        this.checking += deposit;// this refers to an instance of bank user adding to their checking account
        TotalAmmount += deposit;// TotalAmount belongs to bank += deposit adds to total of money owned
    }

    public void SavingsDeposit(Double savingDeposit) {
        this.savings += savingDeposit;
        TotalAmmount += savingDeposit;

    }

    public void CheckingWithdrawal(Double withdrawl) {
        if (this.checking < withdrawl) {
            System.out.println(" Sorry you don't have sufficient funds for this transaction");
        } else {
            this.checking -= withdrawl;
            TotalAmmount -= withdrawl;
        }

    }

    public void SavingsWithdraw(Double withdrawl) {
        if (this.savings < withdrawl) {
            System.out.println(" Sorry you don't have sufficient funds for this transaction");
        } else {
            this.savings -= withdrawl;
            TotalAmmount -= withdrawl;
        }

    }

    public Double getBalance() {
        Double totalBalance = this.checking + this.savings;
        return totalBalance;

    }

    public void displayBalance() {
        Double totalBalance = this.checking + this.savings;

        System.out.println("Your total balance is : $" + totalBalance);
    }
}
