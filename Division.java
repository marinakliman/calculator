public class Division implements Operation {
    @Override
    public ComplexNumber execute(ComplexNumber num1, ComplexNumber num2) {
        double denominator = Math.pow(num2.getReal(), 2) + Math.pow(num2.getImaginary(), 2);
        double real = (num1.getReal() * num2.getReal() + num1.getImaginary() * num2.getImaginary()) / denominator;
        double imaginary = (num1.getImaginary() * num2.getReal() - num1.getReal() * num2.getImaginary()) / denominator;
        return new ComplexNumber(real, imaginary);
    }
}

