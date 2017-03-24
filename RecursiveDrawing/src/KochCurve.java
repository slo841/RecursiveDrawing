import processing.core.PApplet;

public class KochCurve extends PApplet{
	
	public void setup() {
		size(600, 600);
		
		background(255);
		
		Turtle t = new Turtle(50, 300, 0, this);
		
		//t.forward(100);
		drawShape(t, 5, 300);
		
	}
	
	private void drawShape(Turtle t, int level, int length) {		
		if (level <= 1) {
			t.forward(length);
			return;
		}

		drawShape(t, level-1, length / 3);
		t.turnLeft(60.0);
		drawShape(t, level-1, length / 3);
		t.turnRight(120.0);
		drawShape(t, level-1, length / 3);
		t.turnLeft(60.0);
		drawShape(t, level-1, length / 3);
	}
	
	private void drawTree(Turtle t, int n, double length) {
		 if (n == 0) return;
		 //draw line of length for trunk.
		 t.forward(length / 2);
		 
		 //turn left 30 degrees.
		 t.turnLeft(30);
		 
		 drawTree(t, n-1, length*0.6);
	 
		 
		 //turn right 60 degrees
	 
		 //drawTree(n-1, length*0.6);
	 
		 //go back to starting place & turn around.

	}
}
