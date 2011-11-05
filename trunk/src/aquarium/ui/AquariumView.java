package aquarium.ui;

import aquarium.model.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.List;
import javax.swing.JPanel;

public class AquariumView extends JPanel
{
    Aquarium model;
    
    // -- Initialization ------------------------------------------------------
    
    public AquariumView(Aquarium inModel)
    {
        this.model = inModel;
    }
    
    // -- Rendering -----------------------------------------------------------

    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        
        Graphics2D g2 = (Graphics2D)g;

        List<Cell> cells = model.listCells();
        
        for (Cell cell : cells) {
            
            Point.Float center = cell.getLocation();
            int[] properties = cell.getProperties();
            float radius = cell.getRadius();
        
            Rectangle area = new Rectangle(
                    (int)(center.x - radius), (int)(center.y - radius), 
                    (int)(2*radius), (int)(2*radius)
            );
            double singleValue = 10;
            double totalValue = properties.length * singleValue;
            
            double currentValue = 0;
            int startAngle = 0;
            for (int i = 0; i < properties.length; i++) {
                startAngle = (int) (currentValue * 360 / totalValue);
                int arcAngle = (int) (singleValue * 360 / totalValue);
                g.setColor(new Color(properties[i], properties[i], properties[i]));
                g.fillArc(area.x, area.y, area.width, area.height, startAngle, arcAngle);
                currentValue += singleValue;
            }
            
        }
    }
    
    
}
