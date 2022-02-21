
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
	 * stores the player's jersey number
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
	 * creates space in storage for player data
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
	 * @return gives player name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name sets name for player
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return gives jersey number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number sets jersey number
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	
	/**
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
	 * @return gets the number of free throws made
	 */
	public int getOnePointers() {
		return onePointers;
	}

	/**
	 * @return gets the number of regular shots made
	 */
	public int getTwoPointers() {
		return twoPointers;
	}

	/**
	 * @return gets the number of three point shots made
	 */
	public int getThreePointers() {
		return threePointers;
	}
	
	/**
	 * @return total attempts for free throws
	 */
	public int getOnePointerAttempt() {
		return onePointerAttempt;
	}

	/**
	 * @return total attempts for regular shots
	 */
	public int getTwoPointerAttempt() {
		return twoPointerAttempt;
	}

	/**
	 * @return total attempts for three point shots 
	 */
	public int getThreePointerAttempt() {
		return threePointerAttempt;
	}

	/**
	 * @return number of fouls made by player
	 */
	public int getFouls() {
		return fouls;
	}

	/**
	 * @param fouls increase every time they make a foul
	 */
	public void foul() {
		fouls ++;
	}
	
	/**
	 * @return total shots made / total shots attempted
	 */
	public double getShotPercentage() {
		return shotPercentage;
	}
	
	/**
	 * @return all points made by the player
	 */
	public int getTotalPoints() {
		return onePointers + (twoPointers * 2) + (threePointers * 3);
	}
	
	/**
	 * displays the number, name, fouls, and total points for a player
	 */
	public void display_quickStats() {
		System.out.println("#" + number + " " + name + " Fouls=" + fouls + " Points=" + getTotalPoints());
	}
	
	/**
	 * displays all stats that the player has accumulated
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
