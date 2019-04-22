package src.interactiveComponents.buttons;

import java.awt.*;
import java.awt.event.*;

import src.integrate.controller.ControllerUtil;

public class SquareButton extends Button implements MouseListener {
    
    boolean chosenStatus;
    static final int lenOfEdge = 50;
    static String activeButton;

    SquareButton(String nameOfButton){
        super(nameOfButton);
        this.setSize(lenOfEdge, lenOfEdge);
        this.setFont(new Font("Courier", Font.ITALIC,16));
        addMouseListener(this);

    }

    public static String getCurrentActiveButton() {
        return activeButton;
    }
    
    // ControllerUtil.whitenTheInactiveButtons
    public void mouseClicked(MouseEvent e) {
        this.setBackground(Color.GRAY);
        activeButton = this.getLabel();
        ControllerUtil.whitenTheInactiveButtons(activeButton);

     }   

     public void mousePressed(MouseEvent e) {
     }

     public void mouseReleased(MouseEvent e) {
     }

     public void mouseEntered(MouseEvent e) {
     }

     public void mouseExited(MouseEvent e) {
     }
    
}