package Model;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by lukasz on 22/11/2017.
 */
public class Shape {
    public ArrayList<Point> points = new ArrayList<>();

    public void drawYourself(Graphics2D g2d, Point center, int scale){
        int[] xs = new int[points.size()];
        int[] ys = new int[points.size()];
        for(int i = 0; i < points.size(); i++){
            xs[i]= center.getX() + points.get(i).getX() * scale;
            ys[i]= center.getY() + points.get(i).getY() * scale;
        }
        g2d.drawPolygon(xs, ys, points.size());
    }
}
