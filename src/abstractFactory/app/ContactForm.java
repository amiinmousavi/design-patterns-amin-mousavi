package abstractFactory.app;

import abstractFactoryMethod.ant.AntButton;
import abstractFactoryMethod.ant.AntTextBox;
import abstractFactoryMethod.material.MaterialButton;
import abstractFactoryMethod.material.MaterialTextBox;
import abstractFactoryMethod.material.Theme;

public class ContactForm {
    public void render(Theme theme) {
        if (theme == Theme.ANT) {
            new AntTextBox().render();
            new AntButton().render();
        }
        else if (theme == Theme.MATERIAL) {
            new MaterialTextBox().render();
            new MaterialButton().render();
        }
    }
}
