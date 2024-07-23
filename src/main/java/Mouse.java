import java.awt.*;

class Mouse {

    public static void main (String ... args){

        try {
            // These coordinates are screen coordinates
            int xCoord = 0;
            int yCoord = 0;

            // Move the cursor
            Robot robot = new Robot();

            // Move the cursor
            while (true) {
                xCoord++;
                yCoord++;
                robot.mouseMove(xCoord, yCoord);
                System.out.println ("*** MOUSE ***"+ xCoord + " " + yCoord);
            }
        } catch (AWTException e) {
        }
    }
}
