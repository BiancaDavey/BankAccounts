public class SavingsAccountDemo
{
    /**
        This program demonstrates the SavingsAccount class by creating class objects and calling the methods of the class.
    */

   public static void main(String[] args)
   {
        // Create SavingsAccount objects.

        SavingsAccount account1 = new SavingsAccount(520, "John","Smith", true);  
        SavingsAccount account2 = new SavingsAccount(770, "Ellen","Jones", false);   
				   
        // Demonstrating getNumDeposits and getNumWithdrawals methods to display account details.

        System.out.println(account1);
        System.out.println("Number of deposits: " + account1.getNumDeposits());
        System.out.println("Number of withdrawals: " + account1.getNumWithdrawals());
        System.out.println();

        // Comparing account balances using equals method.

        if(account1.equals(account2)) {
            System.out.println(account1.getName() + " has an equal balance to " + account2.getName());
        }
        else {
            System.out.println(account1.getName() + " does not have an equal balance to " + account2.getName());
        }
	  
        // Demonstrating deposit and withdraw methods.

        account1.deposit(100.00);    
        account1.withdraw(50.00);
        account1.withdraw(15.70);

        // Demonstrating getNumDeposits and getNumWithdrawals methods to display account details after transactions are completed.

        System.out.println(account1);
        System.out.println("Number of deposits: " + account1.getNumDeposits());
        System.out.println("Number of withdrawals: " + account1.getNumWithdrawals());
        System.out.println();
   
    }

}
