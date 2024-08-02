package factoryMethod.buttons;

import javax.swing.*;

public class WindowsButtons implements Buttons {
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    JButton button;

    @Override
    public void render() {
        System.out.println("Hello, from Windows Buttons");
        
    }

    @Override
    public void onClick() {
        System.out.println("Clicked windows button");
        
    }
}
