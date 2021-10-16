package _02_Advanced_Robot_Race;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {

	public static void main(String[] args) {
		
		Robot[] robots = new Robot[5];
			
		boolean b = true;
			
		int x = 250;
		int y = 500;
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
			robots[i].setX(x + (i*100));
			robots[i].setY(y);
		}
		String sr = JOptionPane.showInputDialog("What is the maximum distance you want the robots to go? (Enter an Integer)");
		int r = Integer.parseInt(sr);
		while(b) {
			for(int i = 0; i < robots.length; i++) {
				int ran1 = new Random().nextInt(r);
				int ran2 = new Random().nextInt(r);
				int ran3 = new Random().nextInt(r);
				int ran4 = new Random().nextInt(r);
				int ran5 = new Random().nextInt(r);
				Thread r1 = new Thread(()->robots[0].move(ran1));
				Thread r2 = new Thread(()->robots[1].move(ran2));
				Thread r3 = new Thread(()->robots[2].move(ran3));
				Thread r4 = new Thread(()->robots[3].move(ran4));
				Thread r5 = new Thread(()->robots[4].move(ran5));
				r1.start();
				r2.start();
				r3.start();
				r4.start();
				r5.start();
				if(robots[i].getY() < 0) {
					b = false;
				}
			}
		}
		
		JOptionPane.showMessageDialog(null, "A robot has won!");
	}
}


