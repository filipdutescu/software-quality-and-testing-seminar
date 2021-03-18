package ro.ase.csie.cts.g1093.laboratory3.stage3;

import ro.ase.csie.cts.g1093.laboratory3.exceptions.InvalidAccountAgeException;
import ro.ase.csie.cts.g1093.laboratory3.exceptions.InvalidPriceException;
import ro.ase.csie.cts.g1093.laboratory3.stage3.services.IMarketingService;
import ro.ase.csie.cts.g1093.laboratory3.stage3.services.IValidatorService;

public class Product {	
	private IMarketingService _marketingService;	
	private IValidatorService _validatorService;
	
	public Product(IMarketingService marketingService, IValidatorService validatorService) {
		setMarketingService(marketingService);
		setValidatorService(validatorService);
	}
	
	public float computeDiscountedPrice(ProductType productType, float initialPrice, int accountAgeYears)
			throws InvalidPriceException, InvalidAccountAgeException {
		_validatorService.validatePrice(initialPrice);
		_validatorService.validateAccountAge(accountAgeYears);
		
		float fidelityDiscount = productType == ProductType.NEW ? 0.0f : _marketingService.computeFidelityDiscount(accountAgeYears);
		float finalPrice = computeDiscountedPrice(initialPrice, productType, fidelityDiscount);
		
		return finalPrice;
	}
	
	public void setMarketingService(IMarketingService marketingService) {
		if(marketingService == null) {
			throw new NullPointerException();
		}
		_marketingService = marketingService;
	}
	
	public void setValidatorService(IValidatorService validatorService) {
		if(validatorService == null) {
			throw new NullPointerException();
		}
		_validatorService = validatorService;
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
