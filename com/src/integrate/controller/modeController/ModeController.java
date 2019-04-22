package src.integrate.controller.modeController;

import src.interactiveComponents.buttons.SquareButton;

public class ModeController {

    String thisModeName;
    
    public ModeController(String thisModeName) {
        this.thisModeName = thisModeName;
    }

    public static String getCurrentActiveMode() {
        return SquareButton.getCurrentActiveButton();
    }

    public boolean thisModeIsActive() {
        if (this.thisModeName == getCurrentActiveMode()) {
            return true;
        }
        else {
            return false;
        }
    }

}