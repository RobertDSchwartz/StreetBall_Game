
/**
 * @author Robert Schwartz
 *
 */
public class Player {
	/**
	 * stores names of the player
	 */
	private String name;
	
	/**
	 *  the player's jersey number
	 */
	private int number;
	
	/**
	 * number of free throws made
	 */
	private int onePointers;
	
	/**
	 * number of regular shots made
	 */
	private int twoPointers;
	
	/**
	 * number of three point shots made
	 */
	private int threePointers;
	
	/**
	 * number of free throws attempted
	 */
	private int onePointerAttempt;
	
	/**
	 * number of regular shots attempted
	 */
	private int twoPointerAttempt;
	
	/**
	 * number of three point shots attempted
	 */
	private int threePointerAttempt;
	
	/**
	 * number of fouls made
	 */
	private int fouls;
	
	/**
	 * total number of shots made / total number of shots attempted
	 */
	private double shotPercentage;
	
	/**
	 * sets all player data to null/0
	 */
	public Player() {
		this.name = null;
		this.number = 0;
		this.onePointers = 0;
		this.twoPointers = 0;
		this.threePointers = 0;
		this.onePointerAttempt = 0;
		this.twoPointerAttempt = 0;
		this.threePointerAttempt = 0;
		this.fouls = 0;
		this.shotPercentage = 0;
	}

	/**
	 * overload that takes in name and number, to set the fields
	 * 
	 * @param name  player's name to be stored in field
	 * @param number player's jersey number to be stored in field
	 */
	public Player(String name, int number) {
		this();
		this.name = name;
		this.number = number;
	}

	/**
	 * gets player name 
	 * 
	 * @return player name
	 */
	public String getName() {
		return name;
	}

	/**
	 * fills name feild for player
	 * 
	 * @param name sets name for player
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * gets player's jersey number
	 * 
	 * @return gives jersey number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * fills jersey number field for the player
	 * 
	 * @param number sets jersey number
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	
	/**
	 * sets the shot attempts and shots made given certain input
	 * 
	 * @param shotType either 1, 2, or 3 for free throw, normal, and three point shot respectively
	 * @param made depicts whether the shot was made or not
	 */
	public void shotAttempt(int shotType, boolean made) {
		switch (shotType) {
		case 1:
			onePointerAttempt += 1;
			onePointers += made ? 1 : 0;
			break;
		case 2:
			twoPointerAttempt += 1;
			twoPointers += made ? 1 : 0;
			break;
		case 3:
			threePointerAttempt += 1;
			threePointers += made ? 1 : 0;
			break;
		default:
			System.out.println("invalid shot type = " + shotType);
			break;
		}
		shotPercentage = (onePointers + twoPointers + threePointers)/(onePointerAttempt + twoPointerAttempt + threePointerAttempt);
	} 

	/**
	 * gets the number of free throws made by the player
	 * 
	 * @return the number of free throws made
	 */
	public int getOnePointers() {
		return onePointers;
	}

	/**
	 * gets the number of regular shots made by the player
	 * 
	 * @return gets the number of regular shots made
	 */
	public int getTwoPointers() {
		return twoPointers;
	}

	/**
	 * gets the number of three pointer shots that was made by the player
	 * 
	 * @return gets the number of three point shots made
	 */
	public int getThreePointers() {
		return threePointers;
	}
	
	/**
	 * gets the number of free throw attempts that was made by the player
	 * 
	 * @return total attempts for free throws
	 */
	public int getOnePointerAttempt() {
		return onePointerAttempt;
	}

	/**
	 * gets the number of regular shot attempts that was made by the player
	 * 
	 * @return total attempts for regular shots
	 */
	public int getTwoPointerAttempt() {
		return twoPointerAttempt;
	}

	/**
	 * gets the number of three pointer attempts that was made by the player
	 * 
	 * @return total attempts for three point shots 
	 */
	public int getThreePointerAttempt() {
		return threePointerAttempt;
	}

	/**
	 * gets the player's number of fouls
	 * 
	 * @return number of fouls made by player
	 */
	public int getFouls() {
		return fouls;
	}

	/**
	 * increase fouls by 1
	 * 
	 * foul increase every time they make a foul
	 */
	public void foul() {
		fouls ++;
	}
	
	/**
	 * gets shot percentage
	 * 
	 * @return total shots made / total shots attempted
	 */
	public double getShotPercentage() {
		return shotPercentage;
	}
	
	/**
	 * calculates the total points of the player
	 * 
	 * @return all points made by the player
	 */
	public int getTotalPoints() {
		return onePointers + (twoPointers * 2) + (threePointers * 3);
	}
	
	/**
	 * displays simple stats of the player
	 * 
	 * puts the player's the number, name, fouls, and total points for a player
	 */
	public void display_quickStats() {
		System.out.println("#" + number + " " + name + " Fouls=" + fouls + " Points=" + getTotalPoints());
	}
	
	/**
	 * displays all stats that the player has accumulated
	 * 
	 * puts player's name, jersey number, fouls, and shot attempts/makes/percentage of shots made on screen
	 */
	public void display_totalStats() {
		
		int percent_onePointers = (onePointerAttempt != 0) ? onePointers * 100 / onePointerAttempt : 0;
		int percent_twoPointers = (twoPointerAttempt != 0) ? twoPointers * 100 / twoPointerAttempt : 0;
		int percent_threePointers = (threePointerAttempt != 0) ? threePointers * 100 / threePointerAttempt : 0;

		display_quickStats();
		System.out.println("                   Attempts  Baskets  Percent");
		System.out.println("                   --------  -------  -------");
		System.out.printf("Free Throws        %8d %8d %8d\n", onePointerAttempt, onePointers, percent_onePointers);
		System.out.printf("Regular Shots      %8d %8d %8d\n", twoPointerAttempt, twoPointers, percent_twoPointers);
		System.out.printf("Three Pointers     %8d %8d %8d\n", threePointerAttempt, threePointers, percent_threePointers);

	}
}
