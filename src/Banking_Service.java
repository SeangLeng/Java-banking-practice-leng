public class Banking_Service {
    Creditcard savingAccount;
    Creditcard creditCardAccount;

    // fix null pointer in main error
    //1st option
    Banking_Service() {
        savingAccount = new Creditcard();
        creditCardAccount = new Creditcard();
    }

    //2nd option
    Banking_Service(Savingacc savingAccount, Creditcard creditCardAccount) {
        this.savingAccount = creditCardAccount;
        this.creditCardAccount = creditCardAccount;
    }

    float showBalance() {
        return savingAccount.showBalance();
    }

    void addMoney(float amount) {
        savingAccount.deposit(amount);
    }

    void withdrawMoney(float amount) {
        savingAccount.withdraw(amount);
    }
}