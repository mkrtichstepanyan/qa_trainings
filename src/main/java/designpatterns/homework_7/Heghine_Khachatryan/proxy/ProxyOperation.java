package designpatterns.homework_7.Heghine_Khachatryan.proxy;

public class ProxyOperation implements Operations{
    private final String role;
    OperationsPerformance operationsPerformance;

    public ProxyOperation(String role) {
        this.role = role;
    }

    @Override
    public void view() {
        if (role.equalsIgnoreCase("Admin") ||
        role.equalsIgnoreCase("User")) {
            operationsPerformance = new OperationsPerformance();
            operationsPerformance.view();
        } else {
            System.out.println("You aren't allowed to view this content");
        }
    }

    @Override
    public void edit() {
        if (role.equalsIgnoreCase("Admin")) {
            operationsPerformance = new OperationsPerformance();
            operationsPerformance.edit();
        } else {
            System.out.println("You can't edit file");
        }
    }
}
