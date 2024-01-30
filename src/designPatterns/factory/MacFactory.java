package designPatterns.factory;

import designPatterns.factory.components.button.Button;
import designPatterns.factory.components.button.MacButton;
import designPatterns.factory.components.dropdown.DropDown;
import designPatterns.factory.components.dropdown.MacDropDown;
import designPatterns.factory.components.menu.MacMenu;
import designPatterns.factory.components.menu.Menu;

public class MacFactory implements UIFactory{
    @Override
    public Menu createMenu() {
        return new MacMenu();
    }

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public DropDown createDropDown() {
        return new MacDropDown();
    }
}
