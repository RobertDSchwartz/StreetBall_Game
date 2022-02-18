
public class Team {
	private String name;
	private Player player1;
	private Player player2;

	public Team() {
		name = null;
		player1 = new Player();
		player2 = new Player();
	}

	public Team(String name) {
		this();
		this.name = name;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public Player getPlayer1() {
		return player1;
	}

	public void setPlayer1(String name, int number) {
		player1.setName(name);
		player1.setNumber(number);
	}

	public Player getPlayer2() {
		return player2;
	}

	public void setPlayer2(String name, int number) {
		player2.setName(name);
		player2.setNumber(number);
	}
	
	public int getTotalPoints() {
		return player1.getTotalPoints() + player2.getTotalPoints();
	}
	
	public int getTotalFouls() {
		return player1.getFouls() + player2.getFouls();
	}
	
	public void listPlayers() {
		System.out.println("1 = " + player1.getName() + " #" + player1.getNumber());
		System.out.println("2 = " + player2.getName() + " #" + player2.getNumber());
	}
	
	public void displayStats() {
		System.out.println(name + " Fouls=" + getTotalFouls() + " Points=" + getTotalPoints());
	}
		
}
