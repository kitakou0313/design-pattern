package factoryMethod;

import factoryMethod.factory.Dialog;
import factoryMethod.factory.HtmlDialog;
import factoryMethod.factory.WindowDialog;

public class Client {
    private static Dialog dialog;

    static void configure(String pf){
        if (pf == "Windows"){
            dialog = new WindowDialog();
        }else {
            dialog = new HtmlDialog();
        }
    }

    // Client側ではProductとFactoryを常にinterface経由で利用する
    // これにより，具体的な処理については意識を払わずにビズネスロジックに集中できる
    static void runBusinessLogic(){
        dialog.renderWindow();
    }
    public static void main(String[] args) {
        configure("Windows");
        runBusinessLogic();
    }
}
