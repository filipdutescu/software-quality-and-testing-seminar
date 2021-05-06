package ro.ase.csie.cts.g1093.dp.strategy;

public class NoCampaign implements IBonusPointsStrategy {

	@Override
	public void ComputeBonusPoints(float experiencePoints, Player player) {
		player._experiencePoints += experiencePoints;
	}

}
