package ro.ase.csie.cts.g1093.laboratory3.stage3;

import ro.ase.csie.cts.g1093.laboratory3.exceptions.InvalidAccountAgeException;
import ro.ase.csie.cts.g1093.laboratory3.exceptions.InvalidPriceException;

public class Product {
	
	private static final int MAX_ACCOUNT_AGE = 10;
	private static final float MAX_FIDELITY_DISCOUNT = 0.15f;
	
	public float computeDiscountedPrice(ProductType productType, float initialPrice, int accountAgeYears)
			throws InvalidPriceException, InvalidAccountAgeException {
		validatePrice(initialPrice);
		validateAccountAge(accountAgeYears);
		
		float fidelityDiscount = productType == ProductType.NEW ? 0.0f : computeFidelityDiscount(accountAgeYears);
		float finalPrice = computeDiscountedPrice(initialPrice, productType, fidelityDiscount);
		
		return finalPrice;
	}
	
	private static void validatePrice(float price) throws InvalidPriceException {
		if (price <= 0.0f) {
			throw new InvalidPriceException();
		}
	}
	
	private static void validateAccountAge(int accountAgeYears) throws InvalidAccountAgeException {
		if (accountAgeYears <= 0) {
			throw new InvalidAccountAgeException();
		}
	}
	
	private static float computeFidelityDiscount(int accountAgeYears) {
		return accountAgeYears > MAX_ACCOUNT_AGE
				? MAX_FIDELITY_DISCOUNT
				: (float) accountAgeYears / 100;
	}
	
	private static float computeDiscountedPrice(float initialPrice, ProductType productType, float fidelityDiscount) {
		return initialPrice 
				* computeProductDiscountCoefficient(productType)
				* computeFidelityDiscountCoefficient(fidelityDiscount);
	}
	
	private static float computeProductDiscountCoefficient(ProductType productType) {
		return 1.0f - productType.getDiscount();
	}
	
	private static float computeFidelityDiscountCoefficient(float fidelityDiscount) {
		return 1.0f - fidelityDiscount;
	}
}
