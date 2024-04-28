package abstractFactoryMethod.ant;

import abstractFactoryMethod.Button;

public class AntButton implements Button {

    @Override
    public void render() {
        System.out.println("Ant Button");
    }
}
