
package shape;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;


public class Pencil extends Shape implements DrawType {

    @Override
    public void draw(Graphics2D g2d) {
        BasicStroke stroke = null;
        if(miterLimit>=1.0f)
        stroke = new BasicStroke(strokeThickness,endStrokeCap,lineStrokeJoin,miterLimit,
        dashArray,dashPhase);
        if (stroke != null) {
            g2d.setStroke(stroke);
        }
        g2d.setColor(strokeColor);
        if (start != null && end != null) {
            g2d.drawLine(start.x, start.y, end.x, end.y);
        }

    }

    @Override
    public Color getStrokeColor() {
        return strokeColor;
    }

}
