public class Banking_service2 {

    private Bank_account account;

    public Banking_service2(Bank_account account){
        this.account = account;
    }
    public float showBalance(){
        return this.account.showBalance();
    }
    public void withdrawMoney(float amount) {
        account.withdraw(amount);
    }
    public void deposit(float amount){
        account.deposit(amount);
    }

}
