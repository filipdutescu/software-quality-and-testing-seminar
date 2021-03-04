package ro.ase.csie.cts.g1093.laboratory.interfaces;

public interface Profitable {
	public static final double MAX_RATE_PERCENT = 4.0;
	public abstract void addInterest(double interestRatePercent);
}
