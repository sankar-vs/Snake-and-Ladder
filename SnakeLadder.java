import java.util.Scanner;
public class SnakeLadder {
	public static void main(String[] args) {
		int player1Position;
		//Creating a Scanner Obj for multiple uses
		Scanner sc = new Scanner(System.in);
		System.out.println("***** Welcome *****");
		System.out.println("Do u wanna start the game?(Y/N): ");
		String choice = sc.nextLine();
		if ( choice.equals ("y") || choice.equals ("Y") ) {
			player1Position = 0;
			System.out.println("Player1 Starts at Position 0");
		}
		else
			System.out.println("Sad to see you not play!! See Ya!");
	}
}
