package board;
import piece.*;
import java.*;

public class Board{
	// Object attributes
	private Board[][] Tiles  = new Board[8][8];
	private int posX;
	private int posY;
	private char posYChar;
	private char tile;
	
	private CheckersPiece piece;// = new CheckersPiece();
	enum Color{ Red, Black, Clear;}
	// Object Methods
	public void Board(){
		
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				Tiles[i][j] = new Board();
				Tiles[i][j].makeBoard(i, j);
								
			}
		}
	}
	
	/* public void updateBoardEmpty(CheckersPiece[][] input){
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				
				if(input[i][j].tile!='R'||input[i][j].tile!='B'){
					
					piece.currentGame[i][j]= new CheckersPiece();
					piece.currentGame[i][j]= Tiles[i][j];
				}
			}
		}
	} */

	
	public void makeBoard(int a, int b){
		setPosition(a,b);
		setTile(a,b);
		setColor(a,b);
	}
	
	public void setColor(int a,int b){
		Color C = Color.Clear;
	}
	
	public void setTile(int a, int b){
		tile = 'X';
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
	
	public void printBoard(){
		for(int i=0;i<8;i++){
			System.out.print("|");
			for(int j=0;j<8;j++){
				System.out.print(Tiles[i][j].printInfo());
			}
			System.out.print("|\n");
			System.out.println("--------------------------");
		}
	}
	
	public void printTile(int a,int b){
		System.out.print(Tiles[a][b].tile);
	}
	
	public String printInfo(){
		return " " + tile + " ";
				
	}
	
	/* public void requestTile(int a, int b){
		Tiles[a][b].getTile();
	}
	
	public char getTile(){
		return Tiles[][];
	}*/ 
	
}