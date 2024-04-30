package command.regularCommand.customerService.fx;

import command.regularCommand.customerService.CustomerService;

public class AddCustomerCommand implements Command{
    private CustomerService service;

    public AddCustomerCommand(CustomerService service) {
        this.service = service;
    }

    public static void main(String[] args) {

    }
    @Override
    public void execute() {
        service.addCustomer();
    }
}
