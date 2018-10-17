package piece;
import board.*;
import java.*;

public class CheckersPiece{
	private int posX;
	private int posY;
	private String color;
	private int nPieceRed;
	private int nPieceBlack;
	private char posYChar;
	public char tile;
	private int cordX;
	private	int cordY;
	
	enum Color{ Red, Black, Clear;}
	
	public CheckersPiece[][] currentGame = new CheckersPiece[8][8];
	
	//private CheckersPiece[][] black = new CheckersPiece[8][8];
	private CheckersPiece[][] game = new CheckersPiece[8][8];
	
	private Board board = new Board();
	
	public void CheckersPiece(){
		setupGame();
		//blackCheckers();
	}
	
	public void makeCheckers(){
		
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				game[i][j] = new CheckersPiece();
				game[i][j].gamePieces(i, j);
				
				currentGame[i][j] = new CheckersPiece();
				currentGame[i][j].gamePieces(i, j);
								
			}
		}
	}
	
	public void setupGame(){
		makeCheckers();
		//board.updateBoardEmpty(currentGame);
	}
		
	public void gamePieces(int a, int b){
		int nPieceRed = b+1;
		int nPieceBlack = b+1;
		if(a==5&&b%2==0||a==6&&b%2!=0||a==7&&b%2==0){
			Color R = Color.Red;
			setPosition(a,b);
			tile = 'R';
		}
		if(a==0&&b%2!=0||a==1&&b%2==0||a==2&&b%2!=0){
			Color B = Color.Black;
			setPosition(a,b);
			tile = 'B';
		}
		
	}
	
		
	public void setPosition(int x, int y){
		posX = x+1;
		posY = y+1;
		
		
		if (posY == 1){
			posYChar = 'A';
		}
		if (posY == 2){
			posYChar = 'B';
		}
		if (posY == 3){
			posYChar = 'C';
		}
		if (posY == 4){
			posYChar = 'D';
		}
		if (posY == 5){
			posYChar = 'E';
		}
		if (posY == 6){
			posYChar = 'F';
		}
		if (posY == 7){
			posYChar = 'G';
		}
		if (posY == 8){
			posYChar = 'H';
		}
	}
	
	public void printGame(){
		for(int i=0;i<8;i++){
			System.out.print("|");
			for(int j=0;j<8;j++){
				System.out.print(currentGame[i][j].printInfo());
				if (currentGame[i][j]==null){
					board.printTile(i,j);
				}
			}
			System.out.print("|\n");
			System.out.println("--------------------------");
		}
		
	}
	
	
	public String printInfo(){
		return " " + tile + " ";
				
	}
	
	
	
}