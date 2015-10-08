
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bettk6516
 */
public class UsingIfStatements4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        City jw = new City();
        //city is inserted 


        new Wall(jw, 1, 1, Direction.NORTH);
        new Wall(jw, 1, 1, Direction.SOUTH);
        new Wall(jw, 1, 1, Direction.EAST);
        new Wall(jw, 1, 1, Direction.WEST);
        new Wall(jw, 2, 2, Direction.NORTH);
        new Wall(jw, 2, 3, Direction.NORTH);
        new Wall(jw, 1, 4, Direction.NORTH);
        new Wall(jw, 1, 4, Direction.SOUTH);
        new Wall(jw, 1, 4, Direction.EAST);
        new Wall(jw, 1, 4, Direction.WEST);
        new Wall(jw, 2, 3, Direction.EAST);
        new Wall(jw, 3, 3, Direction.EAST);
        new Wall(jw, 4, 4, Direction.EAST);
        new Wall(jw, 4, 4, Direction.NORTH);
        new Wall(jw, 4, 4, Direction.SOUTH);
        new Wall(jw, 4, 4, Direction.WEST);
        new Wall(jw, 3, 2, Direction.SOUTH);
        new Wall(jw, 3, 3, Direction.SOUTH);
        new Wall(jw, 4, 1, Direction.NORTH);
        new Wall(jw, 4, 1, Direction.SOUTH);
        new Wall(jw, 4, 1, Direction.EAST);
        new Wall(jw, 4, 1, Direction.WEST);
        new Wall(jw, 3, 2, Direction.WEST);
        new Wall(jw, 2, 2, Direction.WEST);
        //walls for javas castle

        Robot rob = new Robot(jw,0,0,Direction.EAST);
        
        while(true){
         //loop forever
     
            
            rob.move();
     rob.move();
     rob.turnLeft();
     rob.turnLeft();
     rob.turnLeft();
     rob.move();
     rob.turnLeft();
  rob.move();
  rob.turnLeft();
  rob.move();
  rob.turnLeft();
  rob.turnLeft();
  rob.turnLeft();
rob.move();
rob.move();
rob.turnLeft();
rob.turnLeft();
rob.turnLeft();
//rob will guard the castle

        }
 
        

        
        
    }
}
