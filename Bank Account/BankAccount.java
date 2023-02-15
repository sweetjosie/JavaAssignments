class BankAccount{
    Double checking;
    Double savings;

    // public Double getCheckingBalance(){
    //     return checking;
    // }
    // public void setCheckingBalance(Double balance){
    //     this.checking = balance;
    // }
    //    public Double getSavingsBalance(){
    //     return savings;
    // }
    // public void setSavingsBalance(Double savings){
    //     this.savings = savings;
    // }
    
    //when you have a constructor with arguments you can no longer call the class( BankAccount = new BankAccount()) without the arguments
    // if the constructor is not explicitly decladed an empty one is implicidly included under the hood
    // Now to be able to call the emplty constructor you need to create a zero argument constuctor
    public BankAccount(){}
    //with this you can call BankAccount = new BankAccount() in your test file
   //Default constructor 
    public BankAccount (Double checking, Double savings){
        this.checking = checking;
        this.savings = savings;

    }
}