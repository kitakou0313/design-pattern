package factoryMethod.factory;

import factoryMethod.buttons.Buttons;

public abstract class Dialog {
    public abstract Buttons createButton();
    public void renderWindow(){
        Buttons okButtons = this.createButton();
        okButtons.render();
    }
}
