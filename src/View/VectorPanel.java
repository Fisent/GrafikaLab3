package View;

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

        for(Shape s : shapes) {
            s.drawYourself(g2d);
        }
    }
}
