
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bettk6516
 */
public class usingIfAndWhileStatements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        City jw=new City();
        
        Robot rob=new Robot(jw,1,0,Direction.EAST);
        new Thing(jw,1,1);
        new Thing(jw,1,2);
        new Thing(jw,1,3);
        new Thing(jw,1,4);
        new Thing(jw,1,5);
        new Thing(jw,1,6);
        new Thing(jw,1,7);
        new Thing(jw,1,8);
        new Thing(jw,1,9);
        new Thing(jw,1,10);
        
       
     while(rob.countThingsInBackpack()!=7){
         rob.move();
           if(rob.canPickThing()){    
          rob.pickThing();
           
           }
     }
     if(rob.countThingsInBackpack()==7){
         rob.move();
         rob.move();
         rob.move();
         rob.move();
         
     }
             
    
       
  
       
       
       }
        
        
        
        
    }

