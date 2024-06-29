package Methods;

import java.awt.Point;

public class CallbyReference {
	
	
	

	
 public static void main(String[]args) {
	

		
		Point p1 = new Point();
		p1.x = 10;
		p1.y = 20;
		
		
	int	x = p1.x;
	int y = p1.y;
		
		System.out.println(x);
		System.out.println(y);
		
		
		//System.out.println(" x = " +p1.x  + " , y = " +p1.y);

		change(p1);

	}
	public static void change (Point p) {
		p.x = 20;
		p.y =10;
	}

}
