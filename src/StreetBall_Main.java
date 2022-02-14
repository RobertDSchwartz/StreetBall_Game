import java.util.Scanner;

public class StreetBall_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StreetBall_Player player1_1 = new StreetBall_Player();
		StreetBall_Player player1_2 = new StreetBall_Player();
		StreetBall_Player player2_1 = new StreetBall_Player();
		StreetBall_Player player2_2 = new StreetBall_Player();
		Boolean gameContinue = true;

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
			
		}
		
		System.out.println();
		System.out.println(player1_1.getName());
		System.out.println(player1_2.getName());
		System.out.println(player2_1.getName());
		System.out.println(player2_2.getName());

	}

}
