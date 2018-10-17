import board.*;
import piece.*;
import java.util.Scanner;
public class setupCheckerBoard{
	public static void main(String[] args){
		char choice = 'a';
		
		Scanner inputDevice = new Scanner(System.in);
		
		boolean cont = true;
		Board board = new Board();
		CheckersPiece piece = new CheckersPiece();
		
		while(cont){
			System.out.println("=================================== \n");
			System.out.println("What would you like to do? \n");
			System.out.println("y) Make a new chess board? \n");
			System.out.println("p) Print board \n");
			System.out.println("g) Print game board \n");
			System.out.println("b) Print black pieces \n");
			System.out.println("t) Test space empty/occupied \n");
			System.out.println("q) Quit game \n");
			System.out.println("=================================== \n");
			
			choice = inputDevice.next().charAt(0);
			inputDevice.nextLine();
			
			if(choice=='y'){
				board.Board();
				piece.CheckersPiece();
			}
			if(choice=='p'){
				System.out.println("=================================== \n");
				board.printBoard();
			}
			if(choice=='g'){
				System.out.println("=================================== \n");
				piece.printGame();
			}
			if(choice=='b'){
				System.out.println("=================================== \n");
			}
			if(choice=='t'){
				System.out.println("=================================== \n");
				piece.testSpace();
			}
			if(choice=='q'){
				cont=false;
			}
		}
		
				
	}	
}