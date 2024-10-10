public class OperationFactory {
    public static Operation createOperation(String operation) {
        switch (operation) {
            case "add":
                return new Addition();
            case "multiply":
                return new Multiplication();
            case "divide":
                return new Division();
            default:
                throw new IllegalArgumentException("Unknown operation: " + operation);
        }
    }
}
