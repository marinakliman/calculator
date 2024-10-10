import java.text.DecimalFormat;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CalculatorLogger {
    private static final Logger logger = Logger.getLogger(CalculatorLogger.class.getName());
    private static final DecimalFormat df = new DecimalFormat("#.##");

    static {
        // Устанавливаем консольный обработчик для логгера
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        logger.addHandler(handler);
        logger.setLevel(Level.ALL);
        logger.setUseParentHandlers(false);  // Отключаем использование стандартных обработчиков
    }

    // Обновленный метод log с двумя параметрами: операция и результат
    public static void log(String operation, ComplexNumber result) {
        String message = String.format("Operation: %s, Result: %s", operation, formatComplex(result));
        logger.info(message);
    }

    // Метод для форматирования комплексного числа
    private static String formatComplex(ComplexNumber number) {
        return df.format(number.getReal()) + " + " + df.format(number.getImaginary()) + "i";
    }
}
