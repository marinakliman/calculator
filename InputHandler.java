import java.util.Scanner;

public class InputHandler {
    private Scanner scanner;

    public InputHandler() {
        scanner = new Scanner(System.in);
    }

    public ComplexNumber inputComplexNumber() {
        System.out.println("Enter the real part of the complex number: ");
        double real = scanner.nextDouble();

        System.out.println("Enter the imaginary part of the complex number: ");
        double imaginary = scanner.nextDouble();

        return new ComplexNumber(real, imaginary);
    }

    public String inputOperation() {
        System.out.println("Enter the operation (add, multiply, divide): ");
        return scanner.next();
    }

    public void close() {
        scanner.close();
    }
}
