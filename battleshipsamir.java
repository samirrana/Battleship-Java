
import java.util.Scanner;

public class battleshipsamir{

	
	//objects
    static Board boards1 = new Board();
    static Ship ships1 = new Ship();
    static Trap trap1 = new Trap();
    static Potion potion1 = new Potion();
    static Player Player1 = new Player();
  
    
    
	//variables
    public static void main(String[] args) {
    	String userPlayer;
    	 int attempts=0,
            ShipFound=0,
            life = 15;
       
        
        //methods
        boards1.setBoard();
        ships1.setShips();
        trap1.setTraps();
        potion1.setPotions();
       
        
        //welcomescreen
    	Scanner input = new Scanner(System.in) ;
		System.out.println("Please enter your name:");
		userPlayer = input.nextLine();
	
		System.out.printf("Welcometo the Game %s\n", userPlayer);
		System.out.println("The objective of this game is to find the battleships which are hidden behind a grid of #\n");
		System.out.println("Welcome to Boom the Battleship\n");
		System.out.println("You have 3 difficulties to choose from: Beginner, Intermediate, Advance\n");
		System.out.println("Each difficulty will have different number of ships hidden.Beginner: 80 ships, Intermediate: 50 ships, Advance: 20 ships\n");
		System.out.println("You also have 15 booms or chances to hit at least 5 ships\n");
		System.out.println("You are required to enter the coordinates by (row, column) where you think a ship is hidden\n");
		System.out.println("If you manage to hit a part of the ship, the whole ship will unveil itself from the grid\n");
		System.out.println("Tip: Each ship is 5 characters in length, so if you hit a tail, body or head, you boomed the ship!\n");
		
		System.out.println( "Choose a difficulty:1 (Beginner), 2 (Intermediate), 3 (Advance)");
    	Player1.setDifficultyLevel(input.nextInt());
	     
    	 System.out.printf("So you chose %d, all the best", Player1.getDifficultyLevel());
    	 
    	
	    
	     //executeboard
    	 
        System.out.println();
        
        do{
            boards1.showBoard();
            Player.shoot();
            attempts++;
           //checkforhit
            if(ships1.hitship(Player1.getShoot())){
            System.out.println("You hit a ship!");
                ShipFound++;
            System.out.printf("ShipFound = %d\n" , ShipFound);
            System.out.printf("Attempts = %d\n" , attempts);
            System.out.printf("Life = %d\n" , life);
            }                
            else if (trap1.hitlowtrap(Player1.getShoot())) {
            	System.out.println("You hit a Low Level trap!");
            	life--;
            	System.out.printf("ShipFound = %d\n" , ShipFound);
                System.out.printf("Attempts = %d\n" , attempts);
                System.out.printf("Life = %d\n" , life);   
            }else if (trap1.hithightrap(Player1.getShoot())) {
            	System.out.println("You hit a High Level trap!");
            	life--;
            	life--;
            	System.out.printf("ShipFound = %d\n" , ShipFound);
                System.out.printf("Attempts = %d\n" , attempts);
                System.out.printf("Life = %d\n" , life);   
            } 
            else if (potion1.hitlifepotion(Player1.getShoot())) {
            	System.out.println("You got a life potion!");
            	life++;
            	System.out.printf("ShipFound = %d\n" , ShipFound);
                System.out.printf("Attempts = %d\n" , attempts);
                System.out.printf("Life = %d\n" , life);
            }
            else if (potion1.hittrappotion(Player1.getShoot())) {
            	System.out.println("You hit a trap potion!");
            	System.out.printf("ShipFound = %d\n" , ShipFound);
                System.out.printf("Attempts = %d\n" , attempts);
                System.out.printf("Life = %d\n" , life);
            }
            else if (potion1.hitshippotion(Player1.getShoot())) {
            	System.out.println("You hit a ship potion! , Here's a ship displayed");
            	ShipFound++;
            	System.out.printf("ShipFound = %d\n" , ShipFound);
                System.out.printf("Attempts = %d\n" , attempts);
                System.out.printf("Life = %d\n" , life);
            }
           else {
            	 System.out.println("You missed a ship!");
                 System.out.printf("ShipFound = %d\n" , ShipFound);
                 System.out.printf("Attempts = %d\n" , attempts);
                 System.out.printf("Life = %d\n" , life);
            }
            
           
            
           Board.changeboard(Player1.getShoot(),ships1.getShips(),boards1.getBoard(),trap1.getLowTraps(),potion1.getLifePotions(),trap1.getHighTraps(),potion1.getTrapPotions(), potion1.getShipPotions());
            
         //ENDGAME
        }while(ShipFound!=20);
        
        System.out.println("\n\n\nBattleship Java game finished! You hit 5 ships in "+attempts+" attempts");
        boards1.showBoard();
    }
    
       
    
   
    
   
    
    
    


 


	}

