import java.util.Scanner;
public class SnakeLadder {

	public static int start(int player1Position) {
		//Creating a Scanner Obj for multiple uses
                Scanner sc = new Scanner(System.in);
                System.out.println("***** Welcome *****");
                System.out.println("Do you wanna start the game?(Y/N): ");
                String choice = sc.nextLine();
                if ( choice.equals ("y") || choice.equals ("Y") ) {
                        player1Position = 0;
                        System.out.println("Player1 Starts at Position "+player1Position);
		}
                else {
                        System.out.println("Sad to see you not play!! See Ya!");
                        System.exit(0);
                }
		return player1Position;
	}
	public static void main(String[] args) {
		int player1Position = 0;
		player1Position = start( player1Position );
		int diceRoll = (int)(Math.floor(Math.random()*10) % 6)+1;
		System.out.println("Dice Rolled: "+diceRoll);
                player1Position = player1Position + diceRoll;
                System.out.println("Player1 Postion "+player1Position);

	}
}
