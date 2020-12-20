public abstract class BankAccount {

    /**
        This program simulates a bank account and provides methods for storing a balance and making and recording deposits and withdrawals, with BankAccount being an abstract superclass.
        @param balance a double to hold the account balance.
        @param numDeposits an integer value to hold the number of deposits.
        @param numWithdrawals an integer value to hold the number of withdrawals.
     */

    public double balance;
    public int numDeposits;
    public int numWithdrawals;

    /**
        The BankAccount Constructor initialises the balance.
        @param b a double value representing the balance.
     */
    
    public BankAccount(double b){  // OR BankBalance() and balance = 0.0
        balance = b;
    }

    /**
        The toString method overrides the toString method of the Java object class and returns the balance field in a string.
     */

    public String toString(){
        String s;
        s = "Balance: " + balance;
        return s; 
    }

    /**
        The equals method overrides the Java object class's equals method and uses a boolean flag and an if statement to return true if any account matches the captain's balance of bananas.
        @param compareAccount a SavingsAccount object representing the account to compare.
        @param match a boolean value used as a flag to return true if an account matches the comparison account in balance.
        @return the match field is returned.
     */

    //@Override
    public boolean equals(SavingsAccount compareAccount){
        boolean match;
        if ((balance > compareAccount.balance) || (balance < compareAccount.balance))
            match = false;
        else   
            match = true;
        return match;
    }

    /**
        The deposit method accepts an argument for a deposit amount, adds it to the balance field, and increments the numDeposits field.
        @param d a double representing the amount to deposit.
     */
 
    public void deposit(double d){
        balance += d;
        numDeposits++;
    }

    /**
        The withdraw mthod accepts an argument for a withdrawal amount, subtracts this from the balance field, and increments the numWithdrawals field.
        @param w a double representing the amount to withdraw.
     */
 
    public void withdraw(double w){
        balance -= w;
        numWithdrawals++;
    }

    /**
        The getBalance method returns the balance field.
        @return the balance field is returned.
     */

    public double getBalance(){
        return balance;
    }

    /**
        The getNumDeposits method returns the number of deposits.
        @return the numDeposits field holding the number of deposits is returned.
     */
 
    public int getNumDeposits(){
        return numDeposits;
    }

    /**
        The getNumWithdrawals method returns the number of withdrawals.
        @return the numWithdrawals field holding the number of withdrawals is returned.
     */
 
    public int getNumWithdrawals(){
        return numWithdrawals;
    }

}
