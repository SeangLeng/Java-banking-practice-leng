public class Main {
    public static void main(String[] args) {
        // Banking service 1
        Banking_Service obj = new Banking_Service();
        obj.addMoney(10000);
        System.out.println("Balance is : "+obj.showBalance());
        Bank_account obj2 = new Creditcard();
        Bank_account obj3 = new Savingacc();
        Banking_service2 savingAccount = new Banking_service2(new Savingacc());
        savingAccount.deposit(1230);
        System.out.println("Saving Balance : "+savingAccount.showBalance()+"$");
        Banking_service2 creditCard = new Banking_service2(new Creditcard());
        creditCard.deposit(2333);
        System.out.println("Credit card balance : "+creditCard.showBalance()+"$");

    }
}
