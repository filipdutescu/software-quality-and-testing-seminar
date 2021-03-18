package ro.ase.csie.cts.g1093.laboratory3.stage2;

public enum ProductType {
	NEW(0), DISCOUNT(0.1f), LIMITED_STOCK(0.25f), LEGACY(0.35f);
	
	private final float _discount;
	
	private ProductType(float discount)
	{
		_discount = discount;
	}
	
	public float getDiscount()
	{
		return _discount;
	}
}
