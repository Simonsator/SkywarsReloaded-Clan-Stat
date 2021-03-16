package de.simonsator.partyandfriends.clan.skywarsreloaded;


public class PlayerData {
	public final int wins;
	public final int loses;
	public final double kd;
	public final int deaths;
	public final int kills;

	public PlayerData(int wins, int loses, int deaths, int kills) {
		this.wins = wins;
		this.loses = loses;
		if (deaths != 0)
			this.kd = (double) kills / deaths;
		else
			this.kd = kills;
		this.deaths = deaths;
		this.kills = kills;
	}
}