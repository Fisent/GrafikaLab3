import Model.Point;
import Model.Shape;
import View.VectorPanel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by lukasz on 22/11/2017.
 */
public class Main {

    public static void main(String[] args){
        JFrame frame = new JFrame("Transformacje");
        VectorPanel panel = new VectorPanel();
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1024, 512);
        frame.setVisible(true);

        Shape s = new Shape();
        s.points.add(new Point(500,10));
        s.points.add(new Point(40,100));
        s.points.add(new Point(250,450));
        Shape s2 = new Shape();
        s2.points.add(new Point(150,250));
        s2.points.add(new Point(600,150));
        s2.points.add(new Point(700,450));


        panel.shapes.add(s);
        panel.shapes.add(s2);
        panel.repaint();
    }
}
