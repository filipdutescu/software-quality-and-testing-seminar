package ro.ase.csie.cts.g1093.dp.strategy;

public class EasterCampaign implements IBonusPointsStrategy {

	@Override
	public void ComputeBonusPoints(float experiencePoints, Player player) {
		if (player._playTimeHours > 5) {
			player._experiencePoints += experiencePoints * 2.0F;
		}
		else {
			player._experiencePoints += experiencePoints;
		}
	}

}
