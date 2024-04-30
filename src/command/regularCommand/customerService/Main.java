package command.regularCommand.customerService;

import command.regularCommand.customerService.fx.AddCustomerCommand;
import command.regularCommand.customerService.fx.Button;

public class Main {
    public static void main(String[] args) {
        var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        var button = new Button(command);
        button.click();
    }
}
