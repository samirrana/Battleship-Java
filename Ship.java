import java.util.Random;

public class Ship {

	//variables
   static int[][] ships = new int[50][2];
    

	
	
    //getter & setter
    public int[][] getShips() {
    	return ships;
    }
    
    
    
	
	
    public void setShips(){
    	 Random random = new Random();
         
         for(int ship=0 ; ship < ships.length ; ship++){
        	 ships[ship][0]=random.nextInt(5);
             ships[ship][1]=random.nextInt(5);
             
           
         }
    }
  //hitmethodship
    public boolean hitship(int[] shoot){
        
        for(int ship=0 ; ship<ships.length ; ship++){
            if( shoot[0]==ships[ship][0] && shoot[1]==ships[ship][1]){
            
                return true;
            }
        }
        return false;
      
    }
}

