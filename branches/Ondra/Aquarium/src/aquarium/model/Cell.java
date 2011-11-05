package aquarium.model;

import java.awt.Point;

public class Cell
{
    private int[] properties;
    
    // private generation number
    // velocity vector
    private Point.Float location = null;
    private Point.Float velocity = null;

    //-------------TEMPORARY--------//
    private float radius = 0;
    //      radius of the cell
    //      - cells are considered as non-deforming circles
    //      - temporary until deforming cells are implemented
    //---------END OF TEMPORARY-----//

    //--------------DEBUG------------//
    // private int idnumber
    //----------END OF DEBUG---------//
    
    

    // -- Initialization ------------------------------------------------------
    
    public Cell()
    {
        location = new Point.Float(0,0);
        velocity = new Point.Float(0,0);
    }

    public Cell(float inStartx, float inStarty)
    {
        location = new Point.Float(inStartx, inStarty);
        velocity = new Point.Float(0,0);
    }

    public Cell(float inStartx, float inStarty,
                float inVelocityx, float inVelocityy,
                float inRadius)
    {
        location = new Point.Float(inStartx, inStarty);
        velocity = new Point.Float(inVelocityx, inVelocityy);
        radius = inRadius;
    }

    public Cell(Point.Float inLocation)
    {
        location = inLocation;
    }

    public Cell(Point.Float inLocation,
                Point.Float inStartVelocity)
    {
        location = inLocation;
        velocity = inStartVelocity;
    }
    
    // -- Properties ----------------------------------------------------------

    public int[] getProperties()
    {
        return this.properties;
    }
    
    public void setProperties(int[] properties)
    {
        this.properties = properties;
    }
    
    public Point.Float getVelocity() 
    { 
        return velocity; 
    }
    
    public void setVelocity(Point.Float velocity)
    {
        this.velocity = velocity;
    }
    
    public float getRadius() 
    { 
        return radius; 
    }

    public Point.Float getLocation() 
    { 
        return location; 
    }
    
    public void setLocation(float inx, float iny)
    {
        location.setLocation(inx, iny);
    }
}



