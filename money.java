package bank;

public interface money {

   
    abstract boolean credentialsCheck(String uname,String password,boolean login);
    abstract void credit(double x);
    abstract void debit(double x,boolean login);
    abstract void displayBalance();
    abstract void exit(boolean login);

    
}
