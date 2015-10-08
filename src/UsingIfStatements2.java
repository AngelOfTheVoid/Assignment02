
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
public class UsingIfStatements2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        City jw = new City();
        Robot rob = new Robot(jw, 1, 0, Direction.EAST);

        new Wall(jw, 1, 0, Direction.SOUTH);
        new Wall(jw, 1, 1, Direction.SOUTH);
        new Wall(jw, 1, 2, Direction.SOUTH);
        new Wall(jw, 1, 3, Direction.SOUTH);
        new Wall(jw, 1, 4, Direction.SOUTH);
        new Wall(jw, 1, 5, Direction.SOUTH);
        new Wall(jw, 1, 6, Direction.SOUTH);
        new Wall(jw, 1, 7, Direction.SOUTH);
        new Wall(jw, 1, 8, Direction.SOUTH);
        new Wall(jw, 1, 9, Direction.SOUTH);

        new Wall(jw, 1, 0, Direction.EAST);
        new Wall(jw, 1, 1, Direction.EAST);
        new Wall(jw, 1, 3, Direction.EAST);
        new Wall(jw, 1, 7, Direction.EAST);

        new Thing(jw, 1, 9);





        while (!rob.frontIsClear()) {

            rob.turnLeft();



            while (rob.frontIsClear()) {
                if (rob.canPickThing()) {
                    rob.pickThing();
                    break;
                }

                rob.move();
                rob.turnLeft();
                rob.turnLeft();
                rob.turnLeft();



            }
        }

    }
}
