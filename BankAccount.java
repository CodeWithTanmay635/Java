

public class BankAccount {
    String name;
    double cashDepo ;
    double balance ;
    BankAccount(String n, double cd,double bal){
        name = n;
        cashDepo = cd;
        balance = bal;
            }
    void cashDis(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Account Holder Name: "+name);
        System.out.println("Balance: "+balance);
        System.out.println("\nAccount Holder Name: "+name);

        System.out.println("Cash Deposited: "+cashDepo);
        balance += cashDepo;
        System.out.println("Balance: "+ balance);

    }
    void cashDis(double cashWith){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\nAccount Holder Name: "+name);
        System.out.println("Cash cash Withdraw: "+cashWith);
        balance -= cashWith;
        System.out.println("Balance: "+ balance);

    }
}
