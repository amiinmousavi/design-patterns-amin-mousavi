package abstractFactoryMethod.ant;

import abstractFactoryMethod.TextBox;

public class AntTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Ant Text Box");
    }
}
