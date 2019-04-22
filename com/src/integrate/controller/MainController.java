package src.integrate.controller;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.Vector;

import src.integrate.controller.componentController.ButtonsController;
import src.integrate.controller.componentController.ContainerController;
import src.interactiveComponents.buttons.SquareButton;
import src.nonInteractiveComponents.containers.CanvasContainer;
import src.nonInteractiveComponents.containers.InnerContainer;
import src.nonInteractiveComponents.containers.MainContainer;

public class MainController {

        public static void main(String[] args) {

                Vector<SquareButton> buttons = ButtonsController.initializeButtons();
                MainContainer mainContainer = ContainerController.initializeMainContainer();
                InnerContainer innerContainerForButtons = ContainerController.initializeInnerContainer(Color.WHITE);
                CanvasContainer innerContainerForCanvas = ContainerController.initializeCanvasContainer(Color.GRAY);
                innerContainerForButtons.setLayout(new GridLayout(buttons.size(), 1));
                innerContainerForButtons = IntegrationController.addButtonsToInnerContainer(buttons,
                                innerContainerForButtons);
                mainContainer = IntegrationController.mergeInnerContainerToMainContainer(mainContainer,
                                innerContainerForCanvas, "Center");
                mainContainer = IntegrationController.mergeInnerContainerToMainContainer(mainContainer,
                                innerContainerForButtons, "West");

        }

}