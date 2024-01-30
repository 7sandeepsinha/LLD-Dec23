package designPatterns.factory;

import designPatterns.factory.AndroidFactory;
import designPatterns.factory.Flutter;
import designPatterns.factory.SupportedPlatform;
import designPatterns.factory.UIFactory;
import designPatterns.factory.components.button.Button;
import designPatterns.factory.components.dropdown.DropDown;
import designPatterns.factory.components.menu.Menu;

public class Main {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatform.MAC);
        UIFactory factory = flutter.createUIFactory();
        Menu menu = factory.createMenu();
        Button button = factory.createButton();
        DropDown dropDown = factory.createDropDown();
    }
}
// add a new platform -> MAC
