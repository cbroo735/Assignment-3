package mru.tsc.exceptions;

public class PlayerMismatch extends Exception {
	
	/**
	 * Exception class to for when the minimum number of players for a board game is higher than the maximum number of players
	 */
	public PlayerMismatch()
	{
		super("The minimum number of players has to be lower than the maximum number of players");
	}

}
