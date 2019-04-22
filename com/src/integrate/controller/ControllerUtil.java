package src.integrate.controller;

import java.awt.*;

import src.integrate.controller.componentController.ButtonsController;

public class ControllerUtil {
    public static void displayAllCmp(Container c) {
        for (Component cmp: c.getComponents()) {
            System.out.println(cmp);
        }
    }

    public static void whitenTheInactiveButtons(String activeButton) {
        
        for (Button b : ButtonsController.currentButtons) {
            if (b.getLabel() != activeButton) {
                b.setBackground(Color.WHITE);
            }
        }
    }
}