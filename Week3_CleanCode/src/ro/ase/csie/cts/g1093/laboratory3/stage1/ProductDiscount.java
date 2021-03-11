package ro.ase.csie.cts.g1093.laboratory3.stage1;

public class ProductDiscount {
	
	private static final int MAX_ACCOUNT_AGE = 10;
	private static final float MAX_FIDELITY_DISCOUNT = 0.15f;
	
	public float computeDiscountedPrice(int productType, float initialPrice, int accountAgeYears) {
		float finalPrice = 0;
		float fidelityDiscount = accountAgeYears > MAX_ACCOUNT_AGE
				? MAX_FIDELITY_DISCOUNT
				: (float) accountAgeYears / 100;
		
		if (productType == 1) {
			finalPrice = initialPrice;
		} else if (productType == 2) {
			finalPrice = (initialPrice - (0.1f * initialPrice)) - fidelityDiscount * (initialPrice - (0.1f * initialPrice));
		} else if (productType == 3) {
			finalPrice = (initialPrice - (0.25f * initialPrice)) - fidelityDiscount * (initialPrice - (0.25f * initialPrice));
		} else if (productType == 4) {
			finalPrice = (initialPrice - (0.35f * initialPrice)) - fidelityDiscount * (initialPrice - (0.35f * initialPrice));
		}
		
		return finalPrice;
	}
}
