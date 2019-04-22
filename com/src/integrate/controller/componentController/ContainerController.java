package src.integrate.controller.componentController;

import java.awt.BorderLayout;
import java.awt.Color;

import src.nonInteractiveComponents.containers.CanvasContainer;
import src.nonInteractiveComponents.containers.InnerContainer;
import src.nonInteractiveComponents.containers.MainContainer;

public class ContainerController {

    static final boolean isVisibleOfLowestContainer = true;
    static final int heightOfLowestContainer = 500;
    static final int widthOfLowestContainer = 500;

    static final int heightOfContainerForButton = 200;
    static final int widthOfContainerForButton = 200;


    public static InnerContainer initializeInnerContainer(Color c) {

        return new InnerContainer(widthOfContainerForButton, heightOfContainerForButton, c);

    }

    public static CanvasContainer initializeCanvasContainer(Color c) {

        return new CanvasContainer(widthOfContainerForButton, heightOfContainerForButton, c);

    }

    public static MainContainer initializeMainContainer() {

        MainContainer lowestContainer = new MainContainer(widthOfLowestContainer, heightOfLowestContainer);
        lowestContainer.setLayout(new BorderLayout());
        lowestContainer.setVisible(isVisibleOfLowestContainer);
       
        return lowestContainer;

    }
}