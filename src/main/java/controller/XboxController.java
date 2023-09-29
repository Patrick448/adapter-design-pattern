package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class XboxController {

    private Map<String, Boolean> keysStatus = new HashMap<>();
    private Map<String, Double> analogSticksStatus = new HashMap<>();


    public XboxController(){

        keysStatus.put("a", false);
        keysStatus.put("b", false);
        keysStatus.put("x", false);
        keysStatus.put("y", false);
        keysStatus.put("lb", false);
        keysStatus.put("rb", false);
        keysStatus.put("select", false);
        keysStatus.put("start", false);
        keysStatus.put("la", false);
        keysStatus.put("ra", false);
        keysStatus.put("up", false);
        keysStatus.put("down", false);
        keysStatus.put("left", false);
        keysStatus.put("right", false);
        keysStatus.put("analogLPressed", false);
        keysStatus.put("analogRPressed", false);

        analogSticksStatus.put("analogLx", 0.0);
        analogSticksStatus.put("analogLy", 0.0);
        analogSticksStatus.put("analogRx", 0.0);
        analogSticksStatus.put("analogRy", 0.0);
    }

    public void pressKey(String key){

        if(keysStatus.containsKey(key) == false){
            throw new IllegalArgumentException("Key not found");
        }

            keysStatus.put(key, true);

    }

    public List<String> getKeysPressed() {

        List<String> keys = new ArrayList<>();
        for (String key : keysStatus.keySet()) {
            if (keysStatus.get(key)) {
                keys.add(key);
            }
        }

        return keys;
    }


}
