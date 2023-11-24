package bankaccount;

class BankAccountMain {
    public static void main(String[] args){

        BankAccount account = new BankAccount();

        account.setName("Elena Realisan");
        account.setAge(21);
        account.setAccountNumber(20211758);
        account.deposit(50000.0);
        account.deposit(8000.0);
        account.displaySummary();
    }
}