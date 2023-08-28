package problem2;

public class RobotRunner {
    public static void main(String[]args)
    {
        Robot robot=new Robot();
        robot.turnLeft();
        robot.turnRight();
        robot.getDirection();
        System.out.println(robot.getDirection());
        System.out.print(robot.getLocation());
        System.out.println(robot.getLocation());

    }
}
