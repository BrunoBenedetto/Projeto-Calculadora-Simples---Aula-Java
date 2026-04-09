package program;

import java.util.Locale;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double num1 = Double.parseDouble(JOptionPane.
                showInputDialog(null, "Insira o primeiro número"));

        String operation = JOptionPane.showInputDialog(null, """
                Selecione a operação:
                + (SOMA)
                - (SUBTRAÇÃO)
                * (MULTIPLICAÇÃO)
                / (DIVISÃO)""");

        double num2 = Double.parseDouble(JOptionPane.
                showInputDialog(null, "Insira o segundo número"));

        double result = 0;

        switch (operation) {
            case "+":
                result = num1 + num2;
                break;

            case "-":
                result = num1 - num2;
                break;

            case "*":
                result = num1 * num2;
                break;

            case "/":
                if (num1 == 0 || num2 == 0){
                    JOptionPane.showMessageDialog(null, "Não é possível dividir por 0");
                }
                result = num1 / num2;
                break;

        }
        JOptionPane.showMessageDialog(null, result);
    }
}