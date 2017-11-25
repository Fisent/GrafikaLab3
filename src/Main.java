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
        VectorPanel panel = new VectorPanel(50);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1024, 512);
        frame.setVisible(true);

        Shape s = new Shape();
        s.points.add(new Point(5,1));
        s.points.add(new Point(4,1));
        s.points.add(new Point(2,4));
        Shape s2 = new Shape();
        s2.points.add(new Point(1,2));
        s2.points.add(new Point(6,1));
        s2.points.add(new Point(7,4));


        panel.shapes.add(s);
        panel.shapes.add(s2);
        panel.repaint();
    }
}
