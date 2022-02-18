import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String yesNo = null;
		int shotType = 0;
		int team = 0;
		int player = 0;
		boolean gameContinue = true;
		boolean made = true;
		
		Player player1_1 = new Player();
		Player player1_2 = new Player();
		Player player2_1 = new Player();
		Player player2_2 = new Player();

		System.out.println("Input name for team 1 player 1: ");
		player1_1.setName(sc.nextLine());
		System.out.println("Input name for team 1 player 2: ");
		player1_2.setName(sc.nextLine());
		System.out.println("Input name for team 2 player 1: ");
		player2_1.setName(sc.nextLine());
		System.out.println("Input name for team 2 player 2: ");
		player2_2.setName(sc.nextLine());
		
		while(gameContinue) {
			System.out.println("who took a shot: ");
			team = sc.nextInt();
			player = sc.nextInt();
			System.out.println("what type : ");
			shotType = sc.nextInt();
			System.out.println("did they make it (yes/no) : ");
			yesNo = sc.nextLine();
			if (yesNo == "yes") 
				made = true;
			else
				made = false;
			//made = sc.hasNext;
			System.out.println("continue game? (yes/no) : ");
			yesNo = sc.nextLine();
			if (yesNo == "yes") 
				gameContinue = true;
			else
				gameContinue = false;
			
		}
		
		player1_1.shotAttempt(shotType, made);
		
		System.out.println();
		System.out.println(player1_1.getName());
		System.out.println(player1_1.getTwoPointerAttempt());
		System.out.println(player1_2.getName());
		System.out.println(player2_1.getName());
		System.out.println(player2_2.getName());

		player1_1.display_totalStats();
		player1_2.display_totalStats();
		player2_1.display_totalStats();
		player2_2.display_totalStats();

	}

}
