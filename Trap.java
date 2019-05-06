import java.util.Random;
public class Trap {
	
	//variables
    static int[][] lowtraps = new int [20][2];
    static int[][] hightraps = new int [20][2];

	
	
	

	//getter & setter
    public  int[][] getLowTraps() {
    	return lowtraps;
    }
    
    public  int[][] getHighTraps(){
    	return hightraps;
    	
    }
    
    public void setTraps(){
        Random random = new Random();
        for(int trap=0 ; trap <20; trap++){
            lowtraps[trap][0]=random.nextInt(5);
            hightraps[trap][1]=random.nextInt(5);
         }


	}
    
    
    
  

	
    
 
    
    //hitmethodtrap
    public boolean hitlowtrap(int[] shoot){
          
          for(int trap=0 ; trap<lowtraps.length ; trap++){
              if( shoot[0]==lowtraps[trap][0] && shoot[1]==lowtraps[trap][0]){
                  return true;
                 
              }
          }
          return false;
        
      }
    
    public boolean hithightrap(int[] shoot){
        
        for(int trap=5 ; trap<hightraps.length ; trap++){
            if( shoot[0]==hightraps[trap][0] && shoot[1]==hightraps[trap][1]){
                return true;
               
            }
        }
        return false;
      
    }
      
	

	
	


}