package ro.ase.csie.cts.g1093.laboratory3.stage1;

import ro.ase.csie.cts.g1093.laboratory3.exceptions.InvalidAccountAgeException;
import ro.ase.csie.cts.g1093.laboratory3.exceptions.InvalidPriceException;

public class Product {
	
	private static final int MAX_ACCOUNT_AGE = 10;
	private static final float MAX_FIDELITY_DISCOUNT = 0.15f;
	
	public float computeDiscountedPrice(ProductType productType, float initialPrice, int accountAgeYears)
			throws InvalidPriceException, InvalidAccountAgeException {
		if(initialPrice <= 0.0f)
		{
			throw new InvalidPriceException();
		}
		if(accountAgeYears < 0)
		{
			throw new InvalidAccountAgeException();
		}
		
		float finalPrice = 0;
		float fidelityDiscount = accountAgeYears > MAX_ACCOUNT_AGE
				? MAX_FIDELITY_DISCOUNT
				: (float) accountAgeYears / 100;
		
		switch(productType)
		{
		case NEW:
			finalPrice = initialPrice;
			break;
		case DISCOUNT:
		case LIMITED_STOCK:
		case LEGACY:
			finalPrice = initialPrice * (1.0f - productType.getDiscount()) * (1.0f - fidelityDiscount);
			break;
		default:
			throw new UnsupportedOperationException("Unknown product type.");
		}
		
		return finalPrice;
	}
}
