package src.integrate.controller.modeController;

import java.awt.Graphics;

import src.configuration.configOfMode.ConfigOfMode;

public class ClassModeController extends BasicModeController{
    
    public ClassModeController() {
        super(ConfigOfMode.NAME_OF_CLASS_MODE);
    }

    @Override
    public void performTheModeAction() {
        this.drawRect(10,10,10,10);
    }
}