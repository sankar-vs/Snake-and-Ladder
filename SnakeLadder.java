import java.util.Scanner;
public class SnakeLadder {
	public static void main(String[] args) {
		int player1Position = 0;

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
		//Roll the die to get number between 1 to 6
                int dieRoll = (int)(Math.floor(Math.random()*10) % 6)+1;

               	//As we are not modelling a board of 100 squares, we hypothetically use a variable to create options as 0-No PLay, 1-Ladder, 2-Snake
               	//Lets assume that Once in Ladder the player moves forward and in snake the player moves backward.
               	int position = (int)Math.floor(Math.random()*10) %3;

		System.out.println("Die Rolled: "+dieRoll);
		switch(position) {
			case 0:
				System.out.println("NO PLAY");
				break;
			case 1:
				System.out.println("LADDER");
				player1Position = player1Position + dieRoll;
				break;
			default:
				System.out.println("SNAKE");
				player1Position = player1Position - dieRoll;
		}
                System.out.println("Player1 Postion "+player1Position);

	}
}
