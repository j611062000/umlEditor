package src.nonInteractiveComponents.containers;

import java.awt.event.*;

import src.integrate.controller.modeController.ModeController;

import java.awt.Color;

public class CanvasContainer extends InnerContainer implements MouseListener, MouseMotionListener{

    static int latestMouseMoveXCoordination = 0;
    static int latestMouseMoveYCoordination = 0;
    static int latestMouseClickXCoordination = 0;
    static int latestMouseClickYCoordination = 0;
    static int latestMousePressXCoordination = 0;
    static int latestMousePressYCoordination = 0;
    static int latestMouseReleaseXCoordination = 0;
    static int latestMouseReleaseYCoordination = 0;

    public CanvasContainer(int width, int height, Color backgroundColor) {
        super(width, height, backgroundColor);
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    // implment the methods of MouseListener
    public void mouseClicked(MouseEvent e) {
        latestMouseClickXCoordination = e.getX();
        latestMouseClickYCoordination = e.getY();
        ModeController.mouseActionFromCanvasContainer(latestMouseClickXCoordination, latestMouseClickYCoordination);

        }   

    public void mousePressed(MouseEvent e) {
        latestMousePressXCoordination = e.getX();
        latestMousePressYCoordination = e.getY();
    }

    public void mouseReleased(MouseEvent e) {
        latestMouseReleaseXCoordination = e.getX();
        latestMouseReleaseYCoordination = e.getY();
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }
    
    // implment the methods of MouseMotionListener

    public void mouseMoved(MouseEvent e) {
        latestMouseMoveXCoordination = e.getX();
        latestMouseMoveYCoordination = e.getY();
    }

    public void mouseDragged(MouseEvent e) {
    }

}