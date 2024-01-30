package designPatterns.factory;

import designPatterns.factory.components.button.AndroidButton;
import designPatterns.factory.components.button.Button;
import designPatterns.factory.components.dropdown.AndroidDropDown;
import designPatterns.factory.components.dropdown.DropDown;
import designPatterns.factory.components.menu.AndroidMenu;
import designPatterns.factory.components.menu.Menu;

public class AndroidFactory implements UIFactory{
    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }
}
