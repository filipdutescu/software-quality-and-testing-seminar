package ro.ase.csie.cts.g1093.laboratory3.stage3.services;

import ro.ase.csie.cts.g1093.laboratory3.exceptions.InvalidAccountAgeException;
import ro.ase.csie.cts.g1093.laboratory3.exceptions.InvalidPriceException;

public class ValidatorService implements IValidatorService {

	@Override
	public void validatePrice(float price) throws InvalidPriceException {
		if (price <= 0.0f) {
			throw new InvalidPriceException();
		}
	}

	@Override
	public void validateAccountAge(int accountAgeYears) throws InvalidAccountAgeException {
		if (accountAgeYears <= 0) {
			throw new InvalidAccountAgeException();
		}
	}

}
