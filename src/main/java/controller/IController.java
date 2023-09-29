package controller;

import java.util.List;

public interface IController {

    List<String> getKeysPressed();

    void pressKey(String key);
}
