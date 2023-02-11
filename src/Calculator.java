import javax.swing.*;
public class Calculator {
    public static void main(String[] args) {
            String a = JOptionPane.showInputDialog("The first number?");

            String[] buttons = {"+", "-", "*", "/", "%"};
            int knappNr = JOptionPane.showOptionDialog(null, "Choose calculation method", "Choose",
                    JOptionPane.INFORMATION_MESSAGE,
                    0, null, buttons, buttons[0]);

            String b = JOptionPane.showInputDialog("The second number?");

            double tal1 = Double.parseDouble(a);
            double tal2 = Double.parseDouble(b);

            Methods.printResult(knappNr, tal1, tal2);
    }
}