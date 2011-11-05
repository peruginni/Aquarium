/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aquarium.model;

import aquarium.ui.AquariumWindow;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

/**
 * @project lead Mekky
 * @author Marek
 */
public class Core implements ActionListener
{
    private AquariumModel aquariumModel = null;
    private AquariumWindow aquariumWindow = null;
    private Timer mainTimer = null;


    public Core(AquariumModel inAquariumModel,
                AquariumWindow inAquariumWindow)
    {
        aquariumModel = inAquariumModel;
        aquariumWindow = inAquariumWindow;
     
    }

    public void Start()
    {
        System.out.println("Start");
        aquariumWindow.Start(this);
        //aquariumWindow.Start();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        /* TODO: 1) Runs in loop, performs all logic calls */

        aquariumModel.MoveCells();

        System.out.println("Cycle");
         /*         b) Collision detection
         *  NOTE: -This is a little off. Collisions should really be detected
         *         during the movement phase because:
         *              A) movment changes based on collision
         *              B) multiple collisions are possible in sequence - M.
                  -Also suggest moving collision detection to member method
         *         of class Cell as Cell::DetectCollision(Cell A). This
                   would allow independent collision detection for each two
                   cells as well as allow for movement without setters - M.
                  -Will carry on as planned until plan reworked - M.
         *          c) generation spawning
         
         *
         */

        //aquariumWindow.Refresh();
    }




    
}
