/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aquarium.ui;

import aquarium.model.AquariumModel;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author Marek
 */
public class AquariumWindow extends JFrame
{
    AquariumModel aquariumModel;
    Timer TestTimer;

    public AquariumWindow(AquariumModel inModel)
    {
        aquariumModel = inModel;
    }

    public void Refresh() {}
    public void Start(ActionListener inTimerParam)
    {
        TestTimer = new Timer(50, inTimerParam);
        TestTimer.start();
    }

}
