package factoryMethod.buttons;

/**
 * HtmlButtons
 */
public class HtmlButtons implements Buttons {
    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
    }
    
    @Override
    public void onClick() {
        System.out.println("Clicked!");
    }
    
}
