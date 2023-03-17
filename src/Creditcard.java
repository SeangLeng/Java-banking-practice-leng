public class Creditcard implements Bank_account {
    private float balance;
    private float interestRate;
    private float limitSpending;

    Creditcard(){
        balance = 23;
        limitSpending = 200;
        interestRate = 40;
    }

    @Override
    public void withdraw(double amount) {
        if(amount<=limitSpending){
            if(amount<=balance){
                balance -= amount;
            } else {
                System.out.println("Insufficient amount");
            }
        } else {
            System.out.println("Exceed limitation");
        }
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
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


