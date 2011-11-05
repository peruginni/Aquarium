package aquarium;

import aquarium.model.Aquarium;
import aquarium.model.Core;
import aquarium.ui.AquariumWindow;

public class AquariumApplication
{
    public static void main(String[] args)
    {
        Aquarium testModel = new Aquarium(800, 600);
        AquariumWindow testWindow = new AquariumWindow(testModel);
        Core testCore = new Core(testModel, testWindow);
        testCore.start();
    }
}
