import java.awt.Robot;
import java.util.Random;

class unidle {
    public static void main(String[] args) throws Exception {
	Random rand = new Random();
	Robot robot = new Robot();
	while (true){
	    int x = rand.nextInt(400);
	    int y = rand.nextInt(400);
	    int seconds_mul = rand.nextInt(10) + 5;
	    robot.mouseMove(x,y);
	    // System.out.println("Mouse moved to point " + x + ", " + y);
	    Thread.sleep(seconds_mul*1000);
	}
	
    }
}
