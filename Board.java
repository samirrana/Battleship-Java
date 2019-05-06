public class Board {
	
	//object

    static Ship ships1 = new Ship();
    static Trap trap1 = new Trap();
    static Player Player1 = new Player();
   static Potion potion1 = new Potion();
	
	
	//variables
	private static int[][] board = new int[20][60];
	
	
	//constructor
	public Board() {
		 for(int row=0 ; row < 20; row++ )
	            for(int column=0 ; column < 60 ; column++ )
	                board[row][column]=-1;
	}
	
	//getter & setter
    public int[][] getBoard() {
    	return board;
    }
    
	//board
	  public void setBoard(){
	        for(int row=0 ; row < 20; row++ )
	            for(int column=0 ; column < 60 ; column++ )
	                board[row][column]=-1;
	    }
	
	//method
    public void showBoard(){
   	 System.out.println("\t123456789012345678901234567890123456789012345678901234567890\n");     
   	     for(int row=0 ; row < 20 ; row++ ){
   	        System.out.print((row+1)+"\t");
              for(int column=0 ; column < 60 ; column++ ){
 	                if(board[row][column]==-1){
  	                    System.out.print("#");
  	                    }else if(board[row][column]==0){
   	                    System.out.print("X");
   	                }else if(board[row][column]==1){
   	                    System.out.print("*");
   	                }else if (board[row][column]==2) {
   	                	System.out.print("$");
   	                }else if (board[row][column]==3) {
   	                	System.out.print("@");
   	                }
 	                
   	                
   	            }
   	            System.out.println();
   	        }
    }

   	
    //changeboardwhenhit
    public static void changeboard(int[] shoot, int[][] ships, int[][] board , int [][] lowtraps ,   int[][]lifepotions, int [][]hightraps, int[][]trappotions , int[][]shippotions ){
        if(ships1.hitship(Player1.getShoot()))
            board[shoot[0]][shoot[1]]=1;
        else  if(trap1.hitlowtrap(Player1.getShoot()))
        	board[shoot[0]][shoot[1]] =2;
        else  if(trap1.hithightrap(Player1.getShoot()))
        	board[shoot[0]][shoot[1]] =2;
        else if (potion1.hitlifepotion(Player1.getShoot()))
        	board[shoot[0]][shoot[1]] =3;
        else if (potion1.hittrappotion(Player1.getShoot()))
        	board[shoot[0]][shoot[1]] =3;
        else if (potion1.hitshippotion(Player1.getShoot()))
        	board[shoot[0]][shoot[1]] =3;
        else
            board[shoot[0]][shoot[1]]=0;
    }
}


      
	
