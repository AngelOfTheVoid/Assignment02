
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bettk6516
 */
public class UsingIfStatments3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        City jw=new City();
        Robot rob=new Robot(jw,4,-100,Direction.EAST);
        
       if(rob.getStreet()<0){
         while(rob.getDirection()!=Direction.SOUTH){
            rob.turnLeft();
           //if the street is less then 0 rob will turn to the north     
         }
            while(rob.getStreet()!=0){
            rob.move();
        }
         
         }
       
         if(rob.getAvenue()<0){
             while(rob.getDirection()!=Direction.EAST){
               rob.turnLeft();
             //if the avenue is less then zero
             }
               while(rob.getAvenue()!=0){
                 rob.move();
             
             }
             
         }
         
       
       
       
       
       if(rob.getStreet()>0){
       while(rob.getDirection()!=Direction.NORTH){
            rob.turnLeft();
        }
        while(rob.getStreet()!=0){
        rob.move();
        }
    
        if(rob.getAvenue()>0){
           
        
    while(rob.getDirection()!=Direction.WEST){
    rob.turnLeft();
    }
    
    while(rob.getAvenue()!=0){
        rob.move();
    } 
    }
       }
    
    
    
    
    
    
    
    
    
    }
}
