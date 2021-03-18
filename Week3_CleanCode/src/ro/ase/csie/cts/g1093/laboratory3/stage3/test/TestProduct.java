package ro.ase.csie.cts.g1093.laboratory3.stage3.test;

import ro.ase.csie.cts.g1093.laboratory3.exceptions.InvalidAccountAgeException;
import ro.ase.csie.cts.g1093.laboratory3.exceptions.InvalidPriceException;
import ro.ase.csie.cts.g1093.laboratory3.stage3.Product;
import ro.ase.csie.cts.g1093.laboratory3.stage3.ProductType;
import ro.ase.csie.cts.g1093.laboratory3.stage3.services.IMarketingService;
import ro.ase.csie.cts.g1093.laboratory3.stage3.services.IValidatorService;
import ro.ase.csie.cts.g1093.laboratory3.stage3.services.MarketingStrategySpring2021;
import ro.ase.csie.cts.g1093.laboratory3.stage3.services.ValidatorService;

public class TestProduct {

	public static void main(String[] args) {
		IMarketingService marketingService = new MarketingStrategySpring2021();
		IValidatorService valdiatorService = new ValidatorService();
		Product product = new Product(marketingService, valdiatorService);
		
		try {
			System.out.println("Final price: "
					+ product.computeDiscountedPrice(ProductType.DISCOUNT, 10.0f, 2));
		} catch (InvalidPriceException | InvalidAccountAgeException e) {
			e.printStackTrace();
		}
		
		product.setMarketingService(new IMarketingService() {
			
			@Override
			public float computeFidelityDiscount(int accountAgeYears) {
				return 0.5f;
			}
		});
		try {
			System.out.println("Final price: "
					+ product.computeDiscountedPrice(ProductType.DISCOUNT, 10.0f, 2));
		} catch (InvalidPriceException | InvalidAccountAgeException e) {
			e.printStackTrace();
		}
	}

}
