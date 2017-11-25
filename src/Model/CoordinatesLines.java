package Model;

import sun.security.provider.SHA;

import java.awt.*;

/**
 * Created by lukasz on 24/11/2017.
 */
public class CoordinatesLines extends Shape{
    private int scale;
    private int width;
    private int height;
    private Point center;

    public CoordinatesLines(int scale, int width, int height){
        this.scale = scale;
        this.width = width;
        this.height = height;
        this.center = new Point(width/2, height/2);
    }


    @Override
    public void drawYourself(Graphics2D g2d, Point center, int scale) {
        super.drawYourself(g2d, center, scale);

        for(int i = center.getX(); i < width; i+=scale){
            Point p1 = new Point(i,height/2 + 3);
            Point p2 = new Point(i, height/2 - 3);
            g2d.drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
            //if(i - center.getX()/scale != 0)
                //g2d.drawString((i - center.getX())/scale+"", i, height/2 - 10);
        }

        for(int i = center.getX(); i > 0; i-=scale){
            Point p1 = new Point(i,height/2 + 3);
            Point p2 = new Point(i, height/2 - 3);
            g2d.drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
            //if(i - center.getX()/scale != 0)
                //g2d.drawString((i - center.getX())/scale + "", i, height/2 - 10);
        }

        for(int i = center.getY(); i < height; i+=scale){
            Point p1 = new Point(width/2 + 3, i);
            Point p2 = new Point(width/2 - 3, i);
            g2d.drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
            //if(i - center.getY()/scale!=0)
                //g2d.drawString((i - center.getY())/scale+"", width/2 + 10, i);
        }

        for(int i = center.getY(); i > 0; i-=scale){
            Point p1 = new Point(width/2 + 3, i);
            Point p2 = new Point(width/2 - 3, i);
            g2d.drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
            //if(i - center.getY()/scale!=0)
                //g2d.drawString((i - center.getY())/scale+"", width/2 + 10, i);
        }

        g2d.drawLine(0, height/2, width, height/2);
        g2d.drawLine(width/2, 0, width/2, height);
    }
}
