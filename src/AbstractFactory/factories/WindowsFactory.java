package AbstractFactory.factories;

import AbstractFactory.buttons.Button;
import AbstractFactory.buttons.WindwosButton;
import AbstractFactory.checkboxes.Checkbox;
import AbstractFactory.checkboxes.WindowsCheckbox;

/**
 * WindowsFactory
 */
public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindwosButton();
    }
    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
    
}
