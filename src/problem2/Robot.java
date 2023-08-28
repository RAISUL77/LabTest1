package problem2;

import java.util.Objects;

public class Robot {
    public int AxisX;
    public int AxisY;
    String left="L";
    String str;
        public void turnLeft()
        {
            str = "E";
        }
        public void turnRight() {
            str = "R";
        }
        public void move()
        {
            if (str.equals("W"))
            {
                AxisX=AxisX+1;
            }
            if(str.equals("E"))
            {
                AxisY=AxisY+1;
            }
       }
       public String getDirection()
       {
           String pos=str;
           return pos;
       }
       public int getLocation()
       {
           int position=AxisX;
           return position;
       }
       public int getPosition()
       {
           int position=AxisY;
           return position;
       }

}
