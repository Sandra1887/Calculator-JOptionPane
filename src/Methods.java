import javax.swing.*;

class Methods {
    static double add(double a, double b) {
        return a + b;
    }

    static double sub(double a, double b) {
        return a - b;
    }

    static double mult(double a, double b) {
        return a * b;
    }

    static double div(double a, double b) {
        return a / b;
    }

    static double mod(double a, double b) {
        return a % b;
    }

    static void printResult(int knapp, double tal1, double tal2) {
        if (knapp == 0) {
            JOptionPane.showMessageDialog(null, "Result: " + Methods.add(tal1, tal2));
        } else if (knapp == 1) {
            JOptionPane.showMessageDialog(null, "Result: " + sub(tal1, tal2));
        } else if (knapp == 2) {
            JOptionPane.showMessageDialog(null, "Result: " + mult(tal1, tal2));
        } else if (knapp == 3) {
            JOptionPane.showMessageDialog(null, "Result: " + div(tal1, tal2));
        } else if (knapp == 4) {
            JOptionPane.showMessageDialog(null, "Result: " + mod(tal1, tal2));
        } else {
            JOptionPane.showMessageDialog(null, "Beräkning avbruten");
        }
    }
}
