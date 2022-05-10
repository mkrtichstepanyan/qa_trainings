package designpatterns.homework_7.Heghine_Khachatryan.proxy;

public class ProxyOperation implements Operations{
    private final String role;
    OperationsPerformance operationsPerformance;

    public ProxyOperation(String role) {
        this.role = role;
    }

    @Override
    public void view() {
        if (operationsPerformance == null) {
            if (role.equalsIgnoreCase("Admin") ||
                    role.equalsIgnoreCase("User")) {
                operationsPerformance = new OperationsPerformance();
                System.out.println("an object is created for view operation");
            } else {
               throw new RuntimeException("You aren't allowed to view this content");
            }
        }
                operationsPerformance.view();
    }

    @Override
    public void edit() {
        if (operationsPerformance == null) {
            if (role.equalsIgnoreCase("Admin")) {
                operationsPerformance = new OperationsPerformance();
                System.out.println("an object is created for edit operation");
            } else {
              throw new RuntimeException("You can't edit file");
            }
        }
                operationsPerformance.edit();
    }
}
