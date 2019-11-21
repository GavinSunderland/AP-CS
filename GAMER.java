package apcs;
import robocode.*;
import robocode.util.Utils;
import java.util.Random;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/JuniorRobot.html

/**
 * GAMER - a robot by (your name here)
 */
public class GAMER extends AdvancedRobot
{
	/**
	 * run: GAMER's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// Some color codes: blue, yellow, black, white, red, pink, brown, grey, orange...
		// Sets these colors (robot parts): body, gun, radar, bullet, scan_arc
		setAdjustRadarForRobotTurn(true);
		setAdjustGunForRobotTurn(true);
	
		// Robot main loop
		while(true) {
		

			setTurnRadarLeftRadians(45);
			
			execute();
		
}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		double previousEnergy = 100;
		double changeInEnergy = previousEnergy - e.getEnergy();
	
		int movementDirection = 1;
		setTurnRight(e.getBearing()+90-30*movementDirection);
	 
	if (changeInEnergy>0 ) {
		movementDirection = -movementDirection;
		
		setAhead((e.getDistance()/4+25)*movementDirection);
		
		execute();
		}
	
		setTurnRadarRight(2.0 * Utils.normalRelativeAngleDegrees(getHeading() + e.getBearing() - getRadarHeading()));
	
	
		double GunTurnAngle = getHeading()- getGunHeading() + e.getBearing();
		setTurnGunRight(Utils.normalRelativeAngleDegrees(GunTurnAngle));
		setFire(1);	
		
		
		
		execute();
	
	
		previousEnergy = e.getEnergy();

	
	
	
	
		
	
	}


	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
			//setTurnLeft(90 - e.getBearing());
			//execute();
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall() {
		// Replace the next line with any behavior you would like
		
		setBack(20);
		setTurnLeft(40);
		
		execute();
	}	
}
