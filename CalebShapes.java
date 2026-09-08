/*
 * Filename: CalebShapes.java
 *
 * Lead Author(s):
 * @author Name
 *
 * Other contributors:
 * Tasha Frankie
 * 
 * References:
 * Guzdial, M. J., & Ericson, B. (2007). Introduction to computing and
 * programming with Java: A multimedia approach. New York: Prentice Hall.
 * 
 * Date:
 *
 * Responsibilities of class:
 * 
 * Time spent (write the number of hours/minutes you worked on writing this
 * code): 
 */
public class CalebShapes
{
    //The line below is magic, you don't have to understand it (yet)
    public static void main (String[] args)
    {
        
        // World Create
        World shape = new World();
        
        //Turtle Create
        Turtle a = new Turtle(shape);
        
        a.drawShape(50, 16);
        /*
        Turtle b = new Turtle(shape);
        Turtle c = new Turtle(shape);
        Turtle d = new Turtle(shape);
        
        //Turtle a position
        a.drawShape(50, 30);
        
        //Turtle b position
        b.penUp();
        b.forward(5);
        b.turnLeft();
        b.forward(20);
        b.turnRight();
        b.penDown();
        b.drawShape(60, 30);
        
        
        //Turtle c position
        c.penUp();
        c.forward(10);
        c.turnLeft();
        c.forward(40);
        c.turnRight();
        c.penDown();
        c.drawShape(70, 30);
        
        
        //Turtle d position
        d.penUp();
        d.forward(15);
        d.turnLeft();
        d.forward(60);
        d.turnRight();
        d.penDown();
        d.drawShape(80, 30);
        */
    }
}
