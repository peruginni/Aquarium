/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aquarium.model;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marek
 */
public class AquariumModel
{
    private List<Cell> cells;
    private Dimension aquariumDimensions = null;

    public AquariumModel(int inWindowWidth, int inWindowHeight)
    {
        this.cells = new ArrayList<Cell>();

        cells.add(new Cell(10,-10, 1, -1, 5));

        aquariumDimensions = new Dimension(inWindowWidth, inWindowHeight);
        
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
    
    public List<Cell> listCells() 
    {
        return cells;
    }

    public void MoveCells()
    {
        for(Cell ActiveCell : cells)
        {           
            // TODO: collision detection with other cells
            // WIP: collision with walls

            float movedx = ActiveCell.getLocation().x +
                           ActiveCell.getVelocity().x;
            
            float movedy = ActiveCell.getLocation().y +
                           ActiveCell.getVelocity().y;



            ActiveCell.setLocation(movedx, movedy);

            System.out.print(ActiveCell.getLocation().toString() + " , ");
            System.out.println(aquariumDimensions.width - ActiveCell.getRadius());
        }
    }

    public Dimension getAquariumDimensions() { return aquariumDimensions; }
    
}
