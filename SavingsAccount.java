public class SavingsAccount extends BankAccount {

    /**
        This class extends the BankAccount class to create a subclass type of account and provide methods specifically for this type of account.
        @param firstName a String to hold the first name associated with a SavingsAccount.
        @param lastName a String to hold the last name associated with a SavingsAccount.
        @param TRANSACTION_FEE a final double value to hold the regular transaction fee applying to withdrawals.
        @param currentStudent a Boolean value representing the account holder being a current student or not.  // NEW
     */

    public String firstName;
    public String lastName;
    final double TRANSACTION_FEE = -0.5;
    public Boolean currentStudent = false;  // NEW

    /**
        The SavingsAccount Constructor initialises the savings account with a balance, first name and last name.
        the superclass constructor is called to store the balance.
        @param b a double representing the value for the superclass balance field.
        @param fn a String representing the value for the first name field.
        @param ln a String representing the value for the last name field.
        @param s a Boolean representing the value of the account holder's student status.
     */

    public SavingsAccount(double b, String fn, String ln, Boolean s){
        super(b);
        firstName = fn;
        lastName = ln;
        currentStudent = s;
    }

    /**
        The withdraw method checks the student status of the account holder in order to set the applicable transaction fee.
        The superclass's withdraw method is called to further subtract the applicable transaction fee from the withdrawal amount.
        @param w a double representing the withdrawal amount.
        @param appliedTransactionFee a double representing the applicable transaction fee for specified account matches based on the first name and last name fields.
     */

    public void withdraw(double w){
        double appliedTransactionFee;
        if (currentStudent){
            appliedTransactionFee = 0.1;  // Transaction fee is reduced according to student status of the account holder. 
        }
        else {
            appliedTransactionFee = TRANSACTION_FEE;
        }
        super.withdraw(w -= appliedTransactionFee);
    }

    /**
        The toString method overrides the superclass's toString method to return a string containing the first name and last name field values.
        The superclass toString method is called.
        @return str.
     */

    @Override
    public String toString(){
        String str;
        str = super.toString() + "\nFirst name: " + firstName + "\nLast name: " + lastName;
        return str;
    }

    /**
        The getNamemethod returns the values in the first name and lastName fields in a string.
        @return str.
     */

    public String getName(){
        String str;
        str = firstName + " " + lastName;
        return str;
    }

}
