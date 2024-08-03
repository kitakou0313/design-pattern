package factoryMethod.factory;

import factoryMethod.buttons.Buttons;
import factoryMethod.buttons.HtmlButtons;

public class HtmlDialog extends Dialog {
    @Override
    public Buttons createButton() {
        return new HtmlButtons();
    }
}
