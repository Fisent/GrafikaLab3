package View;

import Model.*;
import Model.Point;
import Model.Shape;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by lukasz on 22/11/2017.
 */
public class VectorPanel extends JPanel{

    public ArrayList<Shape> shapes = new ArrayList<>();

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        CoordinatesLines cl = new CoordinatesLines(50, getWidth(), getHeight());
        cl.drawYourself(g2d);

        for(Shape s : shapes) {
            s.drawYourself(g2d);
        }
    }
}
