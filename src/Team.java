
/**
 * @author Robert Schwartz
 *
 */
public class Team {
	/**
	 * team's name
	 */
	private String name;
	/**
	 * first player in the team
	 */
	private Player player1;
	/**
	 * second player in the team
	 */
	private Player player2;

	/**
	 * sets the team name to null and makes two empty players
	 */
	public Team() {
		name = null;
		player1 = new Player();
		player2 = new Player();
	}

	/**
	 * overload constructor that creates the team with a name
	 * 
	 * @param name sets team name when given one
	 */
	public Team(String name) {
		this();
		this.name = name;
	}

	/**
	 * gets the team name
	 * 
	 * @return gets team name
	 */
	public String getName() {
		return name;
	}


	/**
	 * puts an actual name in the name space
	 * 
	 * @param name sets team name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * gets the information of the first player in the team
	 * 
	 * @return gets all information for player one
	 */
	public Player getPlayer1() {
		return player1;
	}

	/**
	 * sets basic information of the first player
	 * 
	 * @param name gives player one a name
	 * @param number gives player one it's jersey number
	 */
	public void setPlayer1(String name, int number) {
		player1.setName(name);
		player1.setNumber(number);
	}

	/**
	 * gets the information of the second player in the team
	 * 
	 * @return gets all information for player two
	 */
	public Player getPlayer2() {
		return player2;
	}

	/**
	 * sets basic information of the second player
	 * 
	 * @param name gives player two a name
	 * @param number gives player two it's jersey number
	 */
	public void setPlayer2(String name, int number) {
		player2.setName(name);
		player2.setNumber(number);
	}
	
	/**
	 * calculates the total points for the team by adding the points from each player
	 * 
	 * @return gets all points for the team
	 */
	public int getTotalPoints() {
		return player1.getTotalPoints() + player2.getTotalPoints();
	}
	
	/**
	 * calculates the total fouls for the team by adding the fouls from each player
	 * 
	 * @return gets total fouls for both players
	 */
	public int getTotalFouls() {
		return player1.getFouls() + player2.getFouls();
	}
	
	/**
	 * shows the menu for picking a player
	 * shows each name and number
	 * 
	 * displays both the player names and numbers
	 */
	public void listPlayers() {
		System.out.println("1 = " + player1.getName() + " #" + player1.getNumber());
		System.out.println("2 = " + player2.getName() + " #" + player2.getNumber());
	}
	
	/**
	 * shows the quick stats of the team
	 * 
	 * displays the team name, total fouls, and total points
	 */
	public void displayStats() {
		System.out.println(name + " Fouls=" + getTotalFouls() + " Points=" + getTotalPoints());
	}
		
}
