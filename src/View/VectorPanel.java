package View;

import Model.*;
import Model.Point;
import Model.Shape;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.geom.AffineTransform;
import java.util.ArrayList;

/**
 * Created by lukasz on 22/11/2017.
 */
public class VectorPanel extends JPanel{

    public ArrayList<Shape> shapes = new ArrayList<>();
    private Point center;
    private int scale;

    public VectorPanel(int scale){
        super();
        this.scale = scale;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        center = new Point(getWidth()/2, getHeight()/2);

        Graphics2D g2d = (Graphics2D) g;
        g2d.translate(0.0, getHeight());
        g2d.scale(1.0, -1.0);


        CoordinatesLines cl = new CoordinatesLines(scale, getWidth(), getHeight());
        cl.drawYourself(g2d, center, scale);

        for(Shape s : shapes) {
            s.drawYourself(g2d,center,scale);
        }
    }
}
