package aquarium.model;

import java.awt.Dimension;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class Aquarium
{
    private List<Cell> cells;
    private Dimension dimensions = null;

    // -- Initialization ------------------------------------------------------
    
    public Aquarium(int inWindowWidth, int inWindowHeight)
    {
        this.cells = new ArrayList<Cell>();

        Cell cell = new Cell(100, 100, 10, -10, 50);
        cell.setProperties(new int[] {20, 100, 180});
        cells.add(cell);
      
        cell = new Cell(300,200, 10, -10, 50);
        cell.setProperties(new int[] {2, 23, 80});
        cells.add(cell);
        
        dimensions = new Dimension(inWindowWidth, inWindowHeight);
        
    }
   
    // TODO: 1) List of cells
    //       2) List of factors

    // TODO: 1) addcell
    //       2) remove cell
    //       3) collide( cell a, cell b)
    //       4) reproduce from cell ( cell a)
    //              Creates copies of one cell, ie. creates a generation
    //              of one cell


    // TODO: 1) detect collision
    //       2) update position
    //       3) start next generation ()
    //              triggers generation spawning for all appropriate cells
    //              - checks which cells are to reproduce
    //              - gets a new generation of these cells by calling
    //                reproduce from cell() on them.
    
    // -- Controls ------------------------------------------------------------
    
    public List<Cell> listCells() 
    {
        return cells;
    }

    public void moveCells()
    {
        for(Cell activeCell : cells)
        {           
            // TODO: collision detection with other cells
            // WIP: collision with walls

            Point.Float velocity = activeCell.getVelocity();
            float radius = activeCell.getRadius();
            
            float movedx = activeCell.getLocation().x +
                           velocity.x;
            
            float movedy = activeCell.getLocation().y +
                           velocity.y;

            if (movedx - radius < 0) {
                movedx = radius;
                velocity.x = -velocity.x;
            } else if (movedx + radius > dimensions.width) {
                movedx = dimensions.width - radius;
                velocity.x = -velocity.x;
            }
            
            if (movedy - radius < 0) {
                movedy = radius;
                velocity.y = -velocity.y;
            } else if (movedy + radius > dimensions.height) {
                movedy = dimensions.height - radius;
                velocity.y = -velocity.y;
            }

            activeCell.setLocation(movedx, movedy);
            activeCell.setVelocity(velocity);

            System.out.print(activeCell.getLocation().toString() + " , ");
            System.out.println(dimensions.width - activeCell.getRadius());
        }
    }

    // -- Properties ----------------------------------------------------------
    
    public Dimension getDimensions() 
    { 
        return dimensions; 
    }
    
}
