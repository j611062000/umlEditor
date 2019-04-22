package src.integrate.controller;


import java.util.Vector;

import src.interactiveComponents.buttons.SquareButton;
import src.nonInteractiveComponents.containers.InnerContainer;
import src.nonInteractiveComponents.containers.MainContainer;

public class IntegrationController {
   
    public static InnerContainer addButtonsToInnerContainer(Vector<SquareButton> buttons, InnerContainer incon) {
   
        for (SquareButton sb : buttons) {
            incon.add(sb);
        }

        return incon;

    }

    public static MainContainer mergeInnerContainerToMainContainer(MainContainer mc, InnerContainer ic, String position) {

        mc.add(ic, position);

        return mc;

    }
}