package ro.ase.csie.cts.g1093.laboratory3.stage3.services;

public interface IMarketingService {
	
	public static final int MAX_ACCOUNT_AGE = 10;
	public static final float MAX_FIDELITY_DISCOUNT = 0.15f;
	
	public float computeFidelityDiscount(int accountAgeYears);
}
