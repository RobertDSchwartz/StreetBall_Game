import java.text.NumberFormat;

public class StreetBall_Player {
	private String name;
	private int number;
	private int onePointers;
	private int twoPointers;
	private int threePointers;
	private int fouls;
	private int onePointerAttempt;
	private int twoPointerAttempt;
	private int threePointerAttempt;
	private double shotPercentage;
	
	
	public StreetBall_Player() {
		this.name = null;
		this.number = 0;
		this.onePointers = 0;
		this.twoPointers = 0;
		this.threePointers = 0;
		this.fouls = 0;
		this.onePointerAttempt = 0;
		this.twoPointerAttempt = 0;
		this.threePointerAttempt = 0;
		this.shotPercentage = 0;
	}

	public StreetBall_Player(String name, int number) {
		this();
		this.name = name;
		this.number = number;
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
	
	public int getOnePointerAttempt() {
		return onePointerAttempt;
	}

	public int getTwoPointerAttempt() {
		return twoPointerAttempt;
	}

	public int getThreePointerAttempt() {
		return threePointerAttempt;
	}

	public int getFouls() {
		return fouls;
	}

	public void setFouls(int fouls) {
		this.fouls = fouls;
	}
	
	public double getShotPercentage() {
		return shotPercentage;
	}

	public void setShotPercentage(double shotPercentage) {
		this.shotPercentage = shotPercentage;
	}
}
