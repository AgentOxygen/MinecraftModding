package com.mntchkn.cam;


/* Saves all data to specified player
 * Can be added to a global list.
 */
public class PlayerDataPackage {
	// Player unique identifier
	private String player_id;
			
	// Skills
	public int farming = 0;
	public int combat = 0;
	public int cooking = 0;
	public int crafting = 0;
	public int mining = 0;
	public int enchanting = 0;
		
	public PlayerDataPackage(String UID) {
		player_id = UID;
	}
			
	public String getPlayerName() {
		return player_id;
	}
		
}
