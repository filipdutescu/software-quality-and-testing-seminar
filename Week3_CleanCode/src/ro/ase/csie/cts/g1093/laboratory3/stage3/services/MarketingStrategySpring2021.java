package ro.ase.csie.cts.g1093.laboratory3.stage3.services;

public class MarketingStrategySpring2021 implements IMarketingService {

	@Override
	public float computeFidelityDiscount(int accountAgeYears) {
		return accountAgeYears > MAX_ACCOUNT_AGE
				? MAX_FIDELITY_DISCOUNT
				: (float) accountAgeYears / 100;
	}
}
