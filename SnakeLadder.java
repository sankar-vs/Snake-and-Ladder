import java.util.Scanner;
public class SnakeLadder {
	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;
	public static void main(String[] args) {
		int player1Position = 0, player2Position = 0;
		int currentPosition1 = 0, currentPosition2 = 0;
		int count1 = 0, count2 = 0;
		//Creating a Scanner Obj for multiple uses
		Scanner sc = new Scanner(System.in);
		System.out.println("***** Welcome *****");
		System.out.println("Do you wanna start the game?(Y/N): ");
		String choice = sc.nextLine();
		if ( choice.equals ("y") || choice.equals ("Y") ) {
			player1Position = 0;
			player2Position = 0;
			System.out.println("Player1 Starts at Position "+player1Position);
			System.out.println("Player2 Starts at Position "+player2Position);
		}
		else {
			System.out.println("Sad to see you not play!! See Ya!");
			System.exit(0);
		}
		while ( player1Position != 100 && player2Position != 100 ) {
			//Roll the die to get number between 1 to 6
                	int dieRoll1 = (int)(Math.floor(Math.random()*10) % 6)+1;

                	//As we are not modelling a board of 100 squares, we hypothetically use a variable to create options as 0-No PLay, 1-Ladder, 2-Snake
                	//Lets assume that Once in Ladder the player moves forward and in snake the player moves backward.
                	int position1 = (int)Math.floor(Math.random()*10) %3;

			System.out.println("Die Rolled Player1: "+dieRoll1);
			switch(position1) {
				case NO_PLAY:
					System.out.println("No Play");
					break;
				case LADDER:
					player1Position += dieRoll1;
					if ( player1Position > 100 )
						player1Position = currentPosition1;
					int diceRoll = LADDER;
					do {
						diceRoll = (int)(Math.floor(Math.random()*10) % 6)+1;
						if ( diceRoll == LADDER ) {
							player1Position += dieRoll1;
							if ( player1Position > 100 )
                                                		player1Position = currentPosition1;
						currentPosition1 = player1Position;
						count1++;
						}
					} while ( diceRoll == LADDER);
					break;
				default:
					player1Position -= dieRoll1;
					if ( player1Position < 0 )
						player1Position = 0;
			currentPosition1 = player1Position;
			count1++;
			}
			System.out.println("Player-1 Position "+player1Position);
			System.out.println("Number of times the Player-1 Dice was Rolled: "+count1);

		 	// Do the same for player-2
			//Roll the die to get number between 1 to 6
                        int dieRoll2 = (int)(Math.floor(Math.random()*10) % 6)+1;

                        //As we are not modelling a board of 100 squares, we hypothetically use a variable to create options as 0-No PLay, 1-Ladder, 2-Snake
                        //Lets assume that Once in Ladder the player moves forward and in snake the player moves backward.
                        int position2 = (int)Math.floor(Math.random()*10) %3;

                        System.out.println("Die Rolled Player2: "+dieRoll2);
                        switch(position2) {
                                case NO_PLAY:
                                        System.out.println("No Play");
                                        break;
                                case LADDER:
                                        player2Position += dieRoll2;
                                        if ( player2Position > 100 )
                                                player2Position = currentPosition2;
                                        int diceRoll = LADDER;
                                        do {
                                                diceRoll = (int)(Math.floor(Math.random()*10) % 6)+1;
                                                if ( diceRoll == LADDER ) {
                                                        player2Position += dieRoll2;
                                                        if ( player2Position > 100 )
                                                                player2Position = currentPosition2;
                                                currentPosition2 = player1Position;
                                                count2++;
                                                }
                                        } while ( diceRoll == LADDER);
					break;
                                default:
                                        player2Position -= dieRoll2;
                                        if ( player2Position < 0 )
                                                player2Position = 0;
                        currentPosition2 = player2Position;
                        count2++;
                        }
                        System.out.println("Player-2 Position "+player2Position);
                        System.out.println("Number of times the Player-2 Dice was Rolled: "+count2);

		}
		if ( player1Position == 100 )
			System.out.println("Player-1 Wins");
		else
			System.out.println("Player-2 Wins");
	}
}
