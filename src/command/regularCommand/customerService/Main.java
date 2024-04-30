package command.regularCommand;

import command.regularCommand.fx.AddCustomerCommand;
import command.regularCommand.fx.Button;

public class Main {
    public static void main(String[] args) {
        var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        var button = new Button(command);
        button.click();
    }
}
