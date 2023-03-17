public class Savingacc implements Bank_account {
    private float balance;
    private float interestRate;

    Savingacc(){
        balance = 12;
        interestRate = 20;
    }

    @Override
    public void withdraw(double amount) {
        if(amount<=balance){
            balance -= amount;
        } else {
            System.out.println("Insufficient amount");
        }
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }
    public float deposited(float amount){
        return amount;
    }
    @Override
    public float showBalance() {
        return balance;
    }

    @Override
    public float interest() {
        return (balance * interestRate/100);
    }


}

