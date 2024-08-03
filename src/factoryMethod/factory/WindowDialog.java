package factoryMethod.factory;

import factoryMethod.buttons.Buttons;
import factoryMethod.buttons.WindowsButtons;

public class WindowDialog extends Dialog {
    @Override
    public Buttons createButton() {
        return new WindowsButtons();
    }
}
