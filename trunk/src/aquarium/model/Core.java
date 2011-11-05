package aquarium.model;

import aquarium.ui.AquariumWindow;
import java.util.Timer;
import java.util.TimerTask;

public class Core
{
    private Aquarium model = null;
    private AquariumWindow window = null;
    private Timer mainTimer = null;

    // -- Initialization ------------------------------------------------------
    
    public Core(Aquarium inModel, AquariumWindow inWindow)
    {
        model = inModel;
        window = inWindow;
        mainTimer = new Timer();
        mainTimer.schedule(new TimerTask() {
            public void run() {
                performLoopStep();
            }
        }, 1, 50);
    }

    // -- Controls ------------------------------------------------------------
    
    public void start()
    {
        System.out.println("Start");
        window.start();
    }

    public void performLoopStep()
    {
        System.out.println("Cycle");
        
        model.moveCells();

        /* TODO: 1) Runs in loop, performs all logic calls */
        
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

        window.refresh();
    }
}
