
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        class Calc {
            private double a;
            private double b;


            public Calc(Scanner sc) throws NumberFormatException {
                while (true) {
                    try{
                        System.out.println("INFO: Введите a");
                        a = Double.parseDouble(sc.nextLine().replace(',','.'));
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("ERR: ошибка формата данных");
                    }
                }
                while (true) {
                    try {
                        System.out.println("INFO: Введите b");
                        b = Double.parseDouble(sc.nextLine().replace(',','.'));
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("ERR: ошибка формата данных");
                    }
                }
            }


            public void doOpen(Scanner sc) {
                System.out.println("INFO: Введи знак оператора: '+', '/', '-', '*'");
                String operator = sc.nextLine();
                switch (operator) {
                    case "+":
                        System.out.printf("INFO: Итого: %.4f %n", a + b);
                        break;
                    case "-":
                        System.out.printf("INFO: Итого: %.4f %n", a - b);
                        break;
                    case "*":
                        System.out.printf("INFO: Итого: %.4f %n", a * b);
                        break;
                    case "/":
                        if (b != 0) {
                            System.out.printf("INFO: Итого: %.4f %n", a / b);
                        } else {
                            System.out.println("INFO: Итого: на ноль делить нельзя");
                        }
                        break;
                    default: System.out.println("INFO: Такая операция не реализована");
                }
            }


            public void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                Calc calc = new Calc(sc);
                calc.doOpen(sc);
                sc.close();
            }
        }


    }
}
