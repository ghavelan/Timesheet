import java.awt.*;

/**
 * Created by ghavelan on 10/12/15.
 * Used to store days attributes (value, color, ...)
 */
public class Day {

    private Color color;
    private int day;
    private int week;

    public Day(int d, int w, Color c) {
        day = d;
        week = w;
        color = c;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getDay() {
        return day;
    }

    public int getWeek(){ return week;}

}
