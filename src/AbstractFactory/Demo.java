package AbstractFactory;

import AbstractFactory.factories.GUIFactory;
import AbstractFactory.factories.MacOSFactory;
import AbstractFactory.factories.WindowsFactory;
import AbstractFactory.App.*;

public class Demo {
    private static Application configure(){
        GUIFactory factory = null;
        if (true) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        return new Application(factory);
    }

    public static void main(String[] args) {
        Application app = configure();
        app.paint();
    }
}
