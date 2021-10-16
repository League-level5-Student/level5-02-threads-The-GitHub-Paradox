package _01_Olympic_Rings;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded{
	public static void main(String[] args) {
		Robot[] trobots = new Robot[3];
		Robot[] brobots = new Robot[2];
		int x = 250;
		int y = 300;
		for (int i = 0; i < trobots.length; i++) {
			trobots[i] = new Robot();
			trobots[i].setX(x + (i*75));
			trobots[i].setY(y);
			for(int r = 0; r < 180; r++) {
				trobots[i].penDown();
				trobots[i].move(2);
				trobots[i].turn(2);
			}
		}
		for (int i = 0; i < brobots.length; i++) {
			brobots[i] = new Robot();
			brobots[i].setX(x + 18 + (i*75));
			brobots[i].setY(y + 35);
			for(int r = 0; r < 180; r++) {
				brobots[i].penDown();
				brobots[i].move(2);
				brobots[i].turn(2);
			}
		}
		
	}
}

