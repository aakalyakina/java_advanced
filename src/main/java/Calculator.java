import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator(sc);
        calc.doOper(sc);
        sc.close();
    }

     double a;
     double b;


    public Calculator(Scanner sc) throws NumberFormatException {
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



