import processing.core.PApplet;

public class TreeStarter extends PApplet{
    Turtle t;
    
    public void setup(){
        size(600,600);    
        t = new Turtle(100, 300, 0, this);
    
        background(255);
        t.setColor( color(0) );		// set turtle color black
        t.forward(30); 				// move turtle forward 30
        
    	drawTree(t, 1, 200, 30);
    }
    
    public void drawTree(Turtle t, int lvl,float length, 
    						float angle){
    	
    	/* RECURSIVE CASE:
    	 * go forward by length
    	 * turn left by angle
    	 * draw the lvl - 1 tree
    	 * turn right by 2*angle
    	 * draw the lvl -1 tree
    	 * 
    	 * turn left by angle
    	 * go backwards by length
    	 */
    }
}