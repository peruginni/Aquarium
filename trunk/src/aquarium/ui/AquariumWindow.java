package aquarium.ui;

import aquarium.model.*;
import java.awt.Dimension;
import javax.swing.JFrame;

public class AquariumWindow extends JFrame
{
    private AquariumView view;
    private Dimension dimension;
    
    // -- Initialization ------------------------------------------------------
    
    public AquariumWindow(Aquarium inModel)
    {
        this.dimension = inModel.getDimensions();
        this.view = new AquariumView(inModel);
        this.view.setSize(dimension);
        
        this.setTitle("Aquarium");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(dimension);
        
        this.getContentPane().add(this.view); 
        
        this.setVisible(false);
    }
    
    // -- Controls ------------------------------------------------------------
    
    public void start()
    {
        this.setVisible(true);
    }
    
    public void refresh()
    {
        view.repaint();
    }
    
    // -- Properties ----------------------------------------------------------
    
    public Dimension getDimension()
    {
        return this.dimension;
    }
    
    public void setDimension(Dimension dimension)
    {
        this.dimension = dimension;
    }
    
}
