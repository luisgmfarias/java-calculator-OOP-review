import java.util.Scanner;

public class Calculator {

    static public void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Number val1 = new Number();
        Number val2 = new Number();

        String operator = new String();

        Number result = new Number();
        String option = "s";

        while (option.equals("s") || option.equals("S")) {

            System.out.printf("%nDigite o primeiro numero: ");
            val1.setNumber(scan.nextInt());
            System.out.printf("%nDigite o segundo numero: ");
            val2.setNumber(scan.nextInt());

            System.out.printf("%nQual operação deseja fazer? (+, -, /, x): ");
            operator = scan.next();

            switch (operator) {
                case "+":
                    result.setNumber(val1.getNumber() + val2.getNumber());
                    System.out.printf("%nO resultado da soma e: %d ", result.getNumber());

                case "-":
                    result.setNumber(val1.getNumber() - val2.getNumber());
                    System.out.printf("%nO resultado da subtração e: %d ", result.getNumber());

                case "/":
                    result.setNumber(val1.getNumber() / val2.getNumber());
                    System.out.printf("%nO resultado da divisão e: %d ", result.getNumber());

                case "x":
                    result.setNumber(val1.getNumber() * val2.getNumber());
                    System.out.printf("%nO resultado da multiplicação e: %d ", result.getNumber());

            }

            System.out.printf("%nDeseja realizar outro calculo? ");

            option = scan.next();
            System.out.printf("%n%n%n");

        }

    }

}