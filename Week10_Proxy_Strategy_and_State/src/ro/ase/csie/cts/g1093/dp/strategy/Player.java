package ro.ase.csie.cts.g1093.dp.strategy;

public class Player {
	private String _username;
	int _playTimeHours;
	float _experiencePoints;
	private IBonusPointsStrategy _bonusPointsStrategy;
	
	public Player(String username, int playTimeHours, float experiencePoints) {
		_username = username;
		_playTimeHours = playTimeHours;
		_experiencePoints = experiencePoints;
		_bonusPointsStrategy = new NoCampaign();
	}
	
	public void AddExperience(float experiencePoints) {
		if (_bonusPointsStrategy != null) {
			_bonusPointsStrategy.ComputeBonusPoints(experiencePoints, this);	
		}
	}
	
	public void SetBonusPointsStrategy(IBonusPointsStrategy bonusPointsStrategy) {
		_bonusPointsStrategy = bonusPointsStrategy;
	}
}
