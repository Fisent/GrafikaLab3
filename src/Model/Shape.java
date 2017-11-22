package Model;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by lukasz on 22/11/2017.
 */
public class Shape {
    public ArrayList<Point> points;

    public void drawYourself(Graphics2D g2d){
        int[] xs = new int[points.size()];
        int[] ys = new int[points.size()];
        for(int i = 0; i < points.size(); i++){
            xs[i]=points.get(i).getX();
            ys[i]=points.get(i).getY();
        }
        g2d.drawPolygon(xs, ys, points.size());
    }
}
