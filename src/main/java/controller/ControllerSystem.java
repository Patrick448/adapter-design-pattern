package controller;

import java.util.List;

public class ControllerSystem {

    IController controller;
    ControllerAdapter standardController;

    public ControllerSystem(){
        controller = new PS4Controller();
        standardController = new ControllerAdapter(controller);
    }

    public void pressKey(String key){
        controller.pressKey(key);
        standardController.save();
    }

    public List<String> getKeysPressed(){
        return standardController.retrieveKeysPressed();
    }

    public List<String> getXboxKeys(){
        return standardController.getKeysPressed();
    }

}
