package virtualcasino;

public class VirtualCasino {

	/**instance variable for player.*/
	private Player player;

	/**instance variable for blackjack.*/
	private Blackjack blackjack;


	/*********************************
	 * constructor for virtual casino.
	 ********************************/
	public VirtualCasino() {
		//initialize player with $100.
		player = new Player(100, "Guest");
	}

	/**
	 * Returns the current instance of Blackjack.
	 * @return The current instance of Blackjack.
	 */
	public Blackjack getBlackjack() {
		return blackjack;
	}

	/**
	 * Returns the current instance of Player.
	 * @return The current instance of Player.
	 */
	public Player getPlayer() {
		return player;
	}

	/**
	 * Sets the current instance of Player.
	 * @param player The Player to set the instance to.
	 */
	public void setPlayer(final Player player) {
		this.player = player;
	}

	/*********************************
	 * calls blackjack's play method.
	 ********************************/
	public void blackjack() {
		this.blackjack = new Blackjack();
		MenuGUI.getBlackjackController().updatePlayerMoneyLabel();
		MenuGUI.getScreenController().activate("blackjack");
	}
	
	/***********************************
	 * calls roulette's play method.
	 **********************************/
	public void roulette() {
		//Roulette.play(player);
		MenuGUI.getScreenController().activate("roulette");
	}
	
	/**********************************
	 * calls slots' play method.
	 *********************************/
	public void slots() {
		Slots.play(player);
	}
}

