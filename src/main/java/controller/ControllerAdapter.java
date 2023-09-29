package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ControllerAdapter extends XboxController{

    private IController controller;
    private Map<String, String> ps4ToXboxMap = new HashMap<>();
    private Map<String, String> xboxToPs4Map = new HashMap<>();

    public ControllerAdapter(IController controller) {
        this.controller = controller;
        initXboxToPs4Mapping();
        initPs4ToXboxMapping();

    }

    private void initXboxToPs4Mapping(){
        xboxToPs4Map.put("a", "x");
        xboxToPs4Map.put("b", "circle");
        xboxToPs4Map.put("x", "square");
        xboxToPs4Map.put("y", "triangle");
        xboxToPs4Map.put("lb", "lb");
        xboxToPs4Map.put("rb", "rb");
        xboxToPs4Map.put("select", "select");
        xboxToPs4Map.put("start", "start");
        xboxToPs4Map.put("la", "la");
        xboxToPs4Map.put("ra", "ra");
        xboxToPs4Map.put("up", "up");
        xboxToPs4Map.put("down", "down");
        xboxToPs4Map.put("left", "left");
        xboxToPs4Map.put("right", "right");
        xboxToPs4Map.put("analogLPressed", "analogLPressed");
        xboxToPs4Map.put("analogRPressed", "analogRPressed");
    }

    private void initPs4ToXboxMapping(){
        ps4ToXboxMap.put("x", "a");
        ps4ToXboxMap.put("circle", "b");
        ps4ToXboxMap.put("square", "x");
        ps4ToXboxMap.put("triangle", "y");
        ps4ToXboxMap.put("lb", "lb");
        ps4ToXboxMap.put("rb", "rb");
        ps4ToXboxMap.put("select", "select");
        ps4ToXboxMap.put("start", "start");
        ps4ToXboxMap.put("la", "la");
        ps4ToXboxMap.put("ra", "ra");
        ps4ToXboxMap.put("up", "up");
        ps4ToXboxMap.put("down", "down");
        ps4ToXboxMap.put("left", "left");
        ps4ToXboxMap.put("right", "right");
        ps4ToXboxMap.put("analogLPressed", "analogLPressed");
        ps4ToXboxMap.put("analogRPressed", "analogRPressed");
    }

    public List<String> retrieveKeysPressed() {
        List<String> keysPressed  = this.getKeysPressed();

        for (String key : keysPressed) {
            controller.pressKey(xboxToPs4Map.get(key));
        }

        return controller.getKeysPressed();
    }

    public void save() {
        List<String> keysPressed = controller.getKeysPressed();
        for (String key : keysPressed) {
            this.pressKey(ps4ToXboxMap.get(key));
        }
    }


}
