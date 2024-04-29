package abstractFactory.app;

import abstractFactory.ant.AntButton;
import abstractFactory.ant.AntTextBox;
import abstractFactory.material.MaterialButton;
import abstractFactory.material.MaterialTextBox;
import abstractFactory.material.Theme;

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
