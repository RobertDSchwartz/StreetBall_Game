import java.text.NumberFormat;

public class StreetBall_Player {
	private String name;
	private int onePointers;
	private int twoPointers;
	private int threePointers;
	private int fouls;
	private int attempts;
	private int madeattempts;
	private double shotPercentage;
	
	
	public StreetBall_Player() {
		this.name = null;
		this.onePointers = 0;
		this.twoPointers = 0;
		this.threePointers = 0;
		this.fouls = 0;
		this.attempts = 0;
		this.madeattempts = 0;
		this.shotPercentage = 0;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getOnePointers() {
		return onePointers;
	}


	public void setOnePointers(int onePointers) {
		this.onePointers = onePointers;
	}


	public int getTwoPointers() {
		return twoPointers;
	}


	public void setTwoPointers(int twoPointers) {
		this.twoPointers = twoPointers;
	}


	public int getThreePointers() {
		return threePointers;
	}


	public void setThreePointers(int threePointers) {
		this.threePointers = threePointers;
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


	public int getMadeattempts() {
		return madeattempts;
	}


	public void setMadeattempts(int madeattempts) {
		this.madeattempts = madeattempts;
	}


	public double getShotPercentage() {
		return shotPercentage;
	}


	public void setShotPercentage(double shotPercentage) {
		this.shotPercentage = shotPercentage;
	}
	
}
