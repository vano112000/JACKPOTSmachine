package virtualcasino;

import java.util.Scanner;

public class Roulette  {


	
		/***************************************
		 * Plays the roulette game.
		 * @param player the player who plays the game
		 **************************************/
		public static void play(final Player player) {
			RouWheel wheel = new RouWheel();
			Scanner scanner = new Scanner(System.in, "utf-8");
			do {
				wheel.spin();
				System.out.println("player money:$"
				+ player.getMoney());
				System.out.println("Please select what type of "
						+ "bet to make"
						+ "(or '0' to quit): ");
				System.out.println("(Ex: 1:Single number, " 
				+ "2:column1, 3:column2, 4:column3");
				System.out.println(" 5:dozen1, 6:dozen2, " 
				+ "7:dozen3" 
				+ ", " + "8:black, 9:red, 10:odd," 
				+  " 11:even, 12:half1," + " 13:half2)");
				int betType = scanner.nextInt();
				if(betType == 0) {
					break;
				}
				System.out.println("please enter bet amount:");
				int betAmount = scanner.nextInt();
				if(betAmount < 0 
						|| betAmount>player.getMoney()){
					System.out.println("Invalid Bet. "
							+ "Get out of my "
							+ "Roulette"
							+ " table!!");
					break;
				}
				int multiplier = wheel.checkBet(betType, 0);
				System.out.println("Board Value:" 
				+ wheel.getValue());
				if(multiplier == 0) {
					player.changeMoney(betAmount * -1);
					System.out.println("You Lost!");
				}else {
					System.out.println("You Won!");
					betAmount = betAmount*multiplier;
					player.changeMoney(betAmount);
				}
			}while(true);
		}
	}
