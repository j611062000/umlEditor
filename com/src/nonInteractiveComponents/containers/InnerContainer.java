package src.nonInteractiveComponents.containers;

import java.awt.Panel;
import java.awt.Color;;


public class InnerContainer extends Panel{
    
    private static final long serialVersionUID = 1L;

    public InnerContainer(int width, int height, Color backgroundColor) {

        this.setSize(width,height);
        this.setBackground(backgroundColor);
        
    }

}