
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bettk6516
 */
public class UsingIfAndWhileStatments5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        City jw=new City();
        
        new Wall(jw,0,0,Direction.WEST);
    new Wall(jw,1,0,Direction.WEST);
     new Wall(jw,2,0,Direction.WEST);
     new Wall(jw,3,0,Direction.WEST);
     new Wall(jw,4,0,Direction.WEST);
     new Wall(jw,5,0,Direction.WEST);
     new Wall(jw,6,0,Direction.WEST);
      new Wall(jw,7,0,Direction.WEST);
      new Wall(jw,8,0,Direction.WEST);
      new Wall(jw,9,0,Direction.WEST);
      
       new Wall(jw,0,1,Direction.EAST);
      new Wall(jw,1,1,Direction.EAST);
      new Wall(jw,2,1,Direction.EAST);
      new Wall(jw,3,1,Direction.EAST);
      new Wall(jw,4,1,Direction.EAST);
      new Wall(jw,5,1,Direction.EAST);
     new Wall(jw,6,1,Direction.EAST);
       new Wall(jw,7,1,Direction.EAST);
       new Wall(jw,8,1,Direction.EAST);
       new Wall(jw,9,1,Direction.EAST);
      
//makes road
       
       new Wall(jw,0,2,Direction.EAST);
       new Wall(jw,1,3,Direction.NORTH);
       new Wall(jw,1,4,Direction.NORTH);
       new Wall(jw,1,5,Direction.NORTH);
       new Wall(jw,1,6,Direction.NORTH);
    new Wall(jw,1,6,Direction.EAST);
    new Wall(jw,2,6,Direction.EAST);
    new Wall(jw,2,6,Direction.SOUTH);
    new Wall(jw,2,5,Direction.SOUTH);
    new Wall(jw,2,3,Direction.SOUTH);
    new Wall(jw,2,4,Direction.SOUTH);
    new Wall(jw,2,3,Direction.SOUTH);
    new Wall(jw,3,2,Direction.EAST);
    //makes the upper most drive way
    
    new Wall(jw,4,3,Direction.NORTH);
    new Wall(jw,4,4,Direction.NORTH);
    new Wall(jw,4,5,Direction.NORTH);
    new Wall(jw,4,5,Direction.EAST);
    new Wall(jw,4,5,Direction.SOUTH);
     new Wall(jw,4,4,Direction.SOUTH);
     new Wall(jw,4,3,Direction.SOUTH);
    new Wall(jw,5,2,Direction.EAST);
    new Wall(jw,6,2,Direction.EAST);
    //makes the mid most drive way
    
    new Wall(jw,7,4,Direction.NORTH);
    new Wall(jw,7,3,Direction.NORTH);
    new Wall(jw,7,5,Direction.NORTH);
    new Wall(jw,7,6,Direction.NORTH);
    new Wall(jw,7,7,Direction.NORTH);
    new Wall(jw,7,7,Direction.EAST);
    new Wall(jw,8,7,Direction.EAST);
    new Wall(jw,8,7,Direction.SOUTH);
     new Wall(jw,8,6,Direction.SOUTH);
     new Wall(jw,8,5,Direction.SOUTH);
     new Wall(jw,8,4,Direction.SOUTH);
     new Wall(jw,8,3,Direction.SOUTH);
     new Wall(jw,9,2,Direction.EAST);
     new Wall(jw,9,2,Direction.SOUTH);
     //makes the bottom most driveway
     
     new Thing(jw,1,2);
      new Thing(jw,2,2);
      new Thing(jw,1,3);
      new Thing(jw,1,4);
      new Thing(jw,2,4);
       new Thing(jw,2,6);
       new Thing(jw,1,5);
     //makes things on the top most diveway
       
        new Thing(jw,4,2);
     new Thing(jw,4,3);
     new Thing(jw,4,4);
     //makes things on the middle most drive way
     
     new Thing(jw,7,2);
      new Thing(jw,7,3);
      new Thing(jw,8,3);
           new Thing(jw,7,7);
     new Thing(jw,8,6);
    new Thing (jw,8,4);
    
    Robot rob=new Robot(jw,0,2,Direction.SOUTH);
    Robot may=new Robot(jw,0,2,Direction.SOUTH);
    //makes the robots at 0,2 facing south
    
   
      
   //when rob gets to that street it will stop
     
       while(rob.frontIsClear()){
           rob.turnLeft();
              if(!rob.frontIsClear()){
                  rob.turnLeft();
                  rob.turnLeft();
                  rob.turnLeft();
              }        
            if (rob.frontIsClear()){
         
                rob.move();
          if(rob.canPickThing()){
              rob.pickThing();
          }
          
          
        }
    if(!rob.frontIsClear()){
        rob.turnLeft();
        if(rob.frontIsClear()){
            rob.move();
        }
    }
     
      

            
  
    
       
          
   
    
    
    
    
    
       }
    }
    }

