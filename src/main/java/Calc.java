import java.util.Scanner;

/**
 * Задание №1.
 * @author aakalyakina
 * @see <a href="https://sreda.ibs.ru/content/info/12321/from/11785"> Задание </a>
 */
public class Calc {

    /**
     * Главная функция
     * @param args параметры не обрабатываются в программе.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calc calc = new Calc(sc);
        calc.doOper(sc);
        sc.close();
    }

    private double a;
    private double b;

    /**
     * @author aakalyakina
     * Конструктор при вызове просит у пользователя числа a  и b
     * @param sc для ввода из консоли
     */
    public Calc(Scanner sc) throws NumberFormatException {
        while (true) {
            try{
                System.out.println("Введите a");
                a = Double.parseDouble(sc.nextLine().replace(',','.'));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат данных");
            }
        }
        while (true) {
            try {
                System.out.println("Введите b");
                b = Double.parseDouble(sc.nextLine().replace(',','.'));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат данных");
            }
        }
    }

    /**
     * @author aakalyakina
     * Просит у пользователя ввести оператор и выполняет действие согласно оператору для чисел a  и b
     * @param sc для ввода из консоли
     */
    public void doOper(Scanner sc) {
        System.out.println("Введите знак оператора: '+', '-', '*', '/'");
        String operator = sc.nextLine();
        switch (operator) {
            case "+":
                System.out.printf("Ответ: %.4f %n", a + b);
                break;
            case "-":
                System.out.printf("Ответ: %.4f %n", a - b);
                break;
            case "*":
                System.out.printf("Ответ: %.4f %n", a * b);
                break;
            case "/":
                if (b != 0) {
                    System.out.printf("Ответ: %.4f %n", a / b);
                } else {
                    System.out.println("На ноль делить нельзя!");
                }
                break;
            default: System.out.println("Такая операция не реализована");
        }
    }
}
