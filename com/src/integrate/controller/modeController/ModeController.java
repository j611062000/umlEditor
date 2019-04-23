package src.integrate.controller.modeController;

import java.util.*;

public class ModeController {
    
    static Vector<BasicModeController> listOfModeController = new Vector<BasicModeController>();

    ModeController() {
        initializeModeController();
    }

    static void initializeModeController() {
        listOfModeController.add(new ClassModeController());
    }

    public static void mouseActionFromCanvasContainer(Integer mouseXCoordiante, Integer mouseYCoordiante) {
        for (BasicModeController bmc : listOfModeController) {
            if (bmc.thisModeIsActive()) {
                
                break;
            }
        }
    }
}