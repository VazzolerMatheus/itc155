package itc155;

import java.awt.*;


public class Assigment1 {

	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(600, 400);
		Graphics g = panel.getGraphics();
		panel.setBackground(Color.YELLOW);
		
		g.setColor(Color.BLUE);
		g.fillOval(150, 77, 100, 100);
		g.fillOval(350, 77, 100, 100);
		
		
		g.setColor(Color.RED);
		g.fillRect(200, 150, 200, 100);
		g.fillRect(200, 250, 200, 100);
		
		g.setColor(Color.BLACK);
		g.drawLine(200, 250, 400, 250);
		
	}

}
