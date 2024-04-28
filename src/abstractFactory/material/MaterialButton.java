package abstractFactoryMethod.material;

import abstractFactoryMethod.Button;

public class MaterialButton implements Button {
    @Override
    public void render() {
        System.out.println("Material Button");
    }
}
