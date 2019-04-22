package src.integrate.controller.componentController;

import src.interactiveComponents.buttons.*;

import java.util.*;

public class ButtonsController {

    public static Vector<SquareButton> currentButtons;

    public static Vector<SquareButton> initializeButtons() {
        Vector<SquareButton> squareButtons = new Vector<SquareButton>();
        squareButtons.add(new AssociateLineButton());
        squareButtons.add(new ClassButton());
        squareButtons.add(new CompositionLineButton());
        squareButtons.add(new GeneralizationLineButton());
        squareButtons.add(new SelectSquareButton());
        squareButtons.add(new UseCaseButton());

        currentButtons = squareButtons;

        return squareButtons;
        
    }
}