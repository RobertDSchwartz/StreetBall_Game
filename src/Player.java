
/**
 * @author Robert Schwartz
 *
 */
public class Player {
	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private int number;
	/**
	 * 
	 */
	private int onePointers;
	/**
	 * 
	 */
	private int twoPointers;
	/**
	 * 
	 */
	private int threePointers;
	/**
	 * 
	 */
	private int onePointerAttempt;
	/**
	 * 
	 */
	private int twoPointerAttempt;
	/**
	 * 
	 */
	private int threePointerAttempt;
	/**
	 * 
	 */
	private int fouls;
	/**
	 * 
	 */
	private double shotPercentage;
	
	
	/**
	 * 
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
	 * @param name
	 * @param number
	 */
	public Player(String name, int number) {
		this();
		this.name = name;
		this.number = number;
	}

	/**
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	
	/**
	 * @param shotType
	 * @param made
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
	 * @return
	 */
	public int getOnePointers() {
		return onePointers;
	}

	/**
	 * @return
	 */
	public int getTwoPointers() {
		return twoPointers;
	}

	/**
	 * @return
	 */
	public int getThreePointers() {
		return threePointers;
	}
	
	/**
	 * @return
	 */
	public int getOnePointerAttempt() {
		return onePointerAttempt;
	}

	/**
	 * @return
	 */
	public int getTwoPointerAttempt() {
		return twoPointerAttempt;
	}

	/**
	 * @return
	 */
	public int getThreePointerAttempt() {
		return threePointerAttempt;
	}

	/**
	 * @return
	 */
	public int getFouls() {
		return fouls;
	}

	/**
	 * @param fouls
	 */
	public void foul() {
		fouls ++;
	}
	
	/**
	 * @return
	 */
	public double getShotPercentage() {
		return shotPercentage;
	}
	
	/**
	 * @return
	 */
	public int getTotalPoints() {
		return onePointers + (twoPointers * 2) + (threePointers * 3);
	}
	
	/**
	 * 
	 */
	public void display_quickStats() {
		System.out.println("#" + number + " " + name + " Fouls=" + fouls + " Points=" + getTotalPoints());
	}
	
	/**
	 * 
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
