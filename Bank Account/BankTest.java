public class BankTest {
    public static void main(String[] args) {
        
        BankAccount accountUser = new BankAccount();
        accountUser.CheckingDeposit(200.00);
        accountUser.SavingsDeposit(50.00);
        System.out.println(accountUser.getCheckingBalance());
        System.out.println(accountUser.getSavingsBalance());
        System.out.println(accountUser.getBalance());
        accountUser.CheckingWithdrawal(70.00);
        System.out.println(accountUser.getCheckingBalance());
        accountUser.SavingsWithdraw(70.00);
        System.out.println(accountUser.getSavingsBalance());


        BankAccount accountUser1 = new BankAccount();
        accountUser1.CheckingDeposit(500.58);
        accountUser1.SavingsDeposit(250.00);
        System.out.println(accountUser1.getCheckingBalance());
        System.out.println(accountUser1.getSavingsBalance());
        System.out.println(accountUser1.getBalance());
        accountUser1.CheckingWithdrawal(45.26);
        System.out.println(accountUser1.getCheckingBalance());
        accountUser1.SavingsWithdraw(87.42);
        System.out.println(accountUser1.getSavingsBalance());
    }
}
