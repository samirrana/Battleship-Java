import java.util.Random;

public class Potion {
	
    //varoiables 
     static int[][] trappotions = new int[18][2];
     static int[][] shippotions = new int[18][2];
     static int[][] lifepotions = new int[18][2];
     
    
	
	
	
	//getter & setter
    
    public int[][] getLifePotions() {
    	return lifepotions;
    }
    
    public int[][] getTrapPotions() {
    	return trappotions;
    }
    
    public int[][] getShipPotions() {
    	return shippotions;
    }
    
	
    public void setPotions(){
        Random random = new Random();
        
        for(int potion=0 ; potion <18 ; potion++){
            lifepotions[potion][0]=random.nextInt(2);
            trappotions[potion][1]=random.nextInt(2);
            shippotions[potion][1]=random.nextInt(2);
         }
         
    }
    
    
  	//hitpotionmethods
  public  boolean hitlifepotion(int[] shoot){
      
      for(int potion=0 ; potion<lifepotions.length ; potion++){
          if( shoot[0]==lifepotions[potion][0] && shoot[1]==lifepotions[potion][1]){
              return true;
             
          }
      }
      return false;
    
  }
  
 public  boolean hittrappotion(int[] shoot){
      
      for(int potion= 6 ; potion<trappotions.length ; potion++){
          if( shoot[0]==trappotions[potion][0] && shoot[1]==trappotions[potion][1]){
              return true;
             
          }
      }
      return false;
    
  }
   
public  boolean hitshippotion(int[] shoot){
     
     for(int potion= 12 ; potion<shippotions.length ; potion++){
         if( shoot[0]==shippotions[potion][0] && shoot[1]==shippotions[potion][1]){
             return true;
            
         }
     }
     return false;
   
 }


 
 
  }
	
	
	

	

	

	
