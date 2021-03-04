package ro.ase.csie.cts.g1093.laboratory.entities;

import ro.ase.csie.cts.g1093.laboratory.exceptions.IllegalTransferException;
import ro.ase.csie.cts.g1093.laboratory.exceptions.InsufficientFundsException;
import ro.ase.csie.cts.g1093.laboratory.interfaces.Profitable;

public class SavingsAccount extends BankAccount implements Profitable {
	
	public static final double MIN_BALANCE = 100;
	
	public SavingsAccount(String iban) {
		super(iban, MIN_BALANCE);
	}

	@Override
	public void deposit(Double amount) {
		_balance += amount;
	}

	@Override
	public void withdraw(Double amount) throws InsufficientFundsException {
		if(amount > _balance)
			throw new InsufficientFundsException("You need more money.");
		
		_balance -= amount;
	}

	@Override
	public void transfer(Account destination, Double amount) throws InsufficientFundsException, IllegalTransferException {
		if(this == destination)
			throw new IllegalTransferException("You cannot transfer money to your own account.");
		
		withdraw(amount);
		destination.deposit(amount);
	}

	@Override
	public void addInterest(double interestRatePercent) {
		_balance *= (1 + interestRatePercent / 100);
	}

}
