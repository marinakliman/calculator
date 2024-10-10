public class Main {
    public static void main(String[] args) {
        InputHandler inputHandler = new InputHandler();

        try {
            // Ввод первого комплексного числа
            System.out.println("Enter the first complex number:");
            ComplexNumber num1 = inputHandler.inputComplexNumber();

            // Ввод второго комплексного числа
            System.out.println("Enter the second complex number:");
            ComplexNumber num2 = inputHandler.inputComplexNumber();

            // Ввод операции
            String operation = inputHandler.inputOperation();

            // Создаем операцию через фабрику и выполняем её
            Operation selectedOperation = OperationFactory.createOperation(operation);
            if (selectedOperation != null) {
                ComplexNumber result = selectedOperation.execute(num1, num2);
                CalculatorLogger.log(operation, result);  // Логируем операцию и результат
                System.out.println("Result: " + result);
            } else {
                System.out.println("Invalid operation entered.");
            }
        } finally {
            inputHandler.close();  // Закрываем Scanner после использования
        }
    }
}

