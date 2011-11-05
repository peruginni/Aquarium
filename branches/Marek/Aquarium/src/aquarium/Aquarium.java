package aquarium;

import aquarium.model.AquariumModel;
import aquarium.model.Core;
import aquarium.ui.AquariumWindow;

/**
 *
 * @author Ondrej Macoszek <ondra@macoszek.cz>
 */
public class Aquarium
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        AquariumModel testModel = new AquariumModel(800, 600);
        AquariumWindow testWindow = new AquariumWindow(testModel);
        Core testCore = new Core(testModel, testWindow);

        testCore.Start();
    }
}
