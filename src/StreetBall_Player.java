import java.text.NumberFormat;

public class StreetBall_Player {
	private String name;
	private int number;
	private int onePointers;
	private int twoPointers;
	private int threePointers;
	private int fouls;
	private int attempts;
	private double shotPercentage;
	
	
	public StreetBall_Player() {
		this.name = null;
		this.number = 0;
		this.onePointers = 0;
		this.twoPointers = 0;
		this.threePointers = 0;
		this.fouls = 0;
		this.attempts = 0;
		this.shotPercentage = 0;
	}

	public StreetBall_Player(String name) {
		this.name = null;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public void shotAttempt(int shotType, boolean made) {
		
	}

	public int getOnePointers() {
		return onePointers;
	}

	public int getTwoPointers() {
		return twoPointers;
	}

	public int getThreePointers() {
		return threePointers;
	}

	public int getFouls() {
		return fouls;
	}


	public void setFouls(int fouls) {
		this.fouls = fouls;
	}


	public int getAttempts() {
		return attempts;
	}


	public void setAttempts(int attempts) {
		this.attempts = attempts;
	}

	
	public double getShotPercentage() {
		return shotPercentage;
	}


	public void setShotPercentage(double shotPercentage) {
		this.shotPercentage = shotPercentage;
	}
	
}
