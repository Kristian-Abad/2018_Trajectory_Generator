import java.util.Timer;
import java.util.TimerTask;

public class Main {
	static int point = 0;
	public static void main(String[] args) {
		//256.5 in per sec is max vel, 93 in per second squared is the max accel
//		//435.4479242994256386636659765872 max RPM
		TrajectoryGenerator test = new TrajectoryGenerator(161.33403355175406, (161.33403355175406/1.4020270000000001));
//		TrajectoryGenerator test2 = new TrajectoryGenerator(100,50);

		

//		double[][] profile = test.generateTrajectoryForTurning(28, angle);
		
//		double[][] test = new double[][]{{1,2},{2,3}};
//		System.out.println(profile.length);
//		test.generateTrajectoryForTurning(28, 90);
//		test.generateTrajectory(360);
//		360 in is the distance from the driver station the outermost edge of the null territory		
	}
	

	// And From your main() method or any other method



}
