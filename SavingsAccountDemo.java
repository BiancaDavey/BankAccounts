/**
   Demo program for the SavingsAccount class
   Dr. Edmund Sadgrove, UNE, Australia
   COSC120, Assignment P3
*/

public class SavingsAccountDemo
{
   public static void main(String[] args)
   {
      
      // Create a SavingsAccount object for each client, with intial balances.
      SavingsAccount captainMorgan = 
                   new SavingsAccount(10.0, "Captain","Morgan");
      SavingsAccount johnSmith = 
                   new SavingsAccount(5.0, "John","Smith");
      SavingsAccount randolfOliver = 
                   new SavingsAccount(10.0, "Randolf","Oliver");
				   
      // Display account details.
      System.out.println(captainMorgan);
      System.out.println("Number of deposits: " + 
                         captainMorgan.getNumDeposits());
      System.out.println("Number of withdrawals: " + 
                         captainMorgan.getNumWithdrawals());
      System.out.println();
	  
      System.out.println(johnSmith);
      System.out.println("Number of deposits: " + 
                         johnSmith.getNumDeposits());
      System.out.println("Number of withdrawals: " + 
                         johnSmith.getNumWithdrawals());
      System.out.println();
	  
      System.out.println(randolfOliver);
      System.out.println("Number of deposits: " + 
                         randolfOliver.getNumDeposits());
      System.out.println("Number of withdrawals: " + 
                         randolfOliver.getNumWithdrawals());
      System.out.println();
      
	  // Check if any other accounts match Captain Morgon.
      if(captainMorgan.equals(randolfOliver))
		  System.out.println(randolfOliver.getName()+ " has the same balance as " + captainMorgan.getName());
      else
          System.out.println(randolfOliver.getName()+ " does not have the same balance as " + captainMorgan.getName());
      if(captainMorgan.equals(johnSmith))
          System.out.println(johnSmith.getName()+ " has the same balance as " + captainMorgan.getName());
      else
          System.out.println(johnSmith.getName()+ " does not have the same balance as " + captainMorgan.getName());
	  
      // Make some deposits.
      captainMorgan.deposit(5.00);
      captainMorgan.deposit(5.00);
      randolfOliver.deposit(5.00);
      johnSmith.deposit(5.00);
	  
	  // Make some withdrawals.
      captainMorgan.withdraw(5.00);
      captainMorgan.withdraw(5.00);
      captainMorgan.withdraw(5.00);
      randolfOliver.withdraw(5.00);
      johnSmith.withdraw(5.00);
	  
      
	  // Display account details after transactions.
      System.out.println();
      System.out.println(captainMorgan);
      System.out.println("Number of deposits: " + 
                         captainMorgan.getNumDeposits());
      System.out.println("Number of withdrawals: " + 
                         captainMorgan.getNumWithdrawals());
      System.out.println();
	  
      System.out.println(johnSmith);
      System.out.println("Number of deposits: " + 
                         johnSmith.getNumDeposits());
      System.out.println("Number of withdrawals: " + 
                         johnSmith.getNumWithdrawals());
      System.out.println();
	  
      System.out.println(randolfOliver);
      System.out.println("Number of deposits: " + 
                         randolfOliver.getNumDeposits());
      System.out.println("Number of withdrawals: " + 
                         randolfOliver.getNumWithdrawals());
      System.out.println();
      
   }
}
