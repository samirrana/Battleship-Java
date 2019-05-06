import java.util.Scanner;

public class Player {

    private static int[] shoot = new int[6];
    private static int difficultyLevel;
	
    
    
    public Player() {
    	setDifficultyLevel(1); //Default difficulty
    }
    
    public Player(int x) {
    	setDifficultyLevel(x); //Default difficulty
    }
    //getter & setter
     public void setDifficultyLevel(int x) {
    	 difficultyLevel = x;
     }
     
    public  int getDifficultyLevel() {
    	return difficultyLevel;
    }
    
    public int[] getShoot() {
    	return shoot;
    }
    
    
    //shootmethod
    public static void shoot(){
        Scanner UserShot = new Scanner(System.in);
        
        System.out.print("Row: ");
        shoot[0] = UserShot.nextInt();
        shoot[0]--;
        
        System.out.print("Column: ");
        shoot[1] = UserShot.nextInt();
        shoot[1]--;
        
    }
 
  
  
}
