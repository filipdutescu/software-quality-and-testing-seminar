package ro.ase.csie.cts.g1093.dp.strategy;

public class TestStrategy {
	public static void main(String[] args) {
		Player player = new Player("john", 10, 100.0F);
		
		player.AddExperience(150.0F);
		System.out.println(String.format("XP: %f", player._experiencePoints));
		
		player.SetBonusPointsStrategy(new EasterCampaign());
		player.AddExperience(150.0F);
		System.out.println(String.format("XP: %f", player._experiencePoints));
		
		player.SetBonusPointsStrategy(new SummerCampaign());
		player.AddExperience(150.0F);
		System.out.println(String.format("XP: %f", player._experiencePoints));
	}
}
