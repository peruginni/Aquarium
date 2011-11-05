/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aquarium.model;

import java.awt.Point;
import java.awt.geom.Point2D;

/**
 *
 * @author Marek
 */
public class Cell
{
    // private list of properties
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

    public Point.Float getLocation() { return location; }
    public Point.Float getVelocity() { return velocity; }
    public float getRadius() { return radius; }

    public void setLocation(float inx, float iny)
    {
        location.setLocation(inx, iny);
    }




}



