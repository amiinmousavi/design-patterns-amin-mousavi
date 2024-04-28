package abstractFactoryMethod.material;

import abstractFactoryMethod.TextBox;

public class MaterialTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Material TextBox");
    }
}
