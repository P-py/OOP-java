import javax.swing.JOptionPane;

public class JOptionPaneExample {
    public static void main(String[] args) {
        // Input dialog (always returns a String)
        String input = JOptionPane.showInputDialog("Enter something:");

        // Output dialog
        JOptionPane.showMessageDialog(null, "You typed: " + input);
    }
}