package ro.ase.csie.cts.g1093.laboratory3.stage3.services;

import ro.ase.csie.cts.g1093.laboratory3.exceptions.InvalidAccountAgeException;
import ro.ase.csie.cts.g1093.laboratory3.exceptions.InvalidPriceException;

public interface IValidatorService {
	
	public void validatePrice(float price) throws InvalidPriceException;
	
	public void validateAccountAge(int accountAgeYears) throws InvalidAccountAgeException;
}
