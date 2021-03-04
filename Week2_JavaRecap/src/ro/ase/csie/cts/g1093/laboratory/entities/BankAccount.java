package ro.ase.csie.cts.g1093.laboratory.entities;

public abstract class BankAccount extends Account {

	protected String _iban;
	protected double _balance;
	
	public BankAccount(String iban, double balance) {
		_iban = iban;
		_balance = balance;
	}
	
	@Override
	public double getBalance() {
		return _balance;
	}

}
