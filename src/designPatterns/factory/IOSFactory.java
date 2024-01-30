package designPatterns.factory;

import designPatterns.factory.UIFactory;
import designPatterns.factory.components.button.Button;
import designPatterns.factory.components.button.IOSButton;
import designPatterns.factory.components.dropdown.DropDown;
import designPatterns.factory.components.dropdown.IOSDropDown;
import designPatterns.factory.components.menu.IOSMenu;
import designPatterns.factory.components.menu.Menu;

public class IOSFactory implements UIFactory {
    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }

    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public DropDown createDropDown() {
        return new IOSDropDown();
    }
}
