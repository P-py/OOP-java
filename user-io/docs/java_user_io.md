# 📘 Java User Input and Output

Data in a Java program can be provided in two ways:  
- **Hard-coding** → values are directly assigned in the code.  
- **Input & Output (I/O)** → values are obtained through user interaction.  

Java provides multiple ways to interact with the user and gather input:  
- **JOptionPane** (Swing)  
- **JavaFX** (GUI applications)  
- **Scanner** (console, native)  

---

## 1. Input and Output with `JOptionPane`

The `JOptionPane` class (from `javax.swing`) provides simple dialog boxes for input and output in GUI-based applications.

```java
import javax.swing.JOptionPane;

public class JOptionPaneExample {
    public static void main(String[] args) {
        // Input dialog (always returns a String)
        String input = JOptionPane.showInputDialog("Enter something:");

        // Output dialog
        JOptionPane.showMessageDialog(null, "You typed: " + input);
    }
}
```

✅ **Key Points**  
- Always returns data as **String** → parsing is required for numbers (`Integer.parseInt`, `Double.parseDouble`, etc.).  
- Good for **quick GUIs** but not recommended for large-scale applications.  

---

## 2. Input and Output with `Scanner`

The `Scanner` class (from `java.util`) is commonly used for console-based applications.  
It works by opening a **data stream** and reading **tokens** (by default, separated by whitespace).

```java
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Different data types
        int x = sc.nextInt();
        double y = sc.nextDouble();
        String z = sc.next();

        System.out.println("Integer: " + x);
        System.out.println("Double: " + y);
        System.out.println("String: " + z);

        sc.close(); // Always close the scanner
    }
}
```

✅ **Key Points**  
- Can directly read different data types without manual parsing.  
- Works with **tokens** (default delimiter = whitespace).  
- Always close the `Scanner` after use to avoid resource leaks.  

---

## 3. Console Input and Output Example

```java
import java.util.Scanner;

public class ConsoleIOExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        scanner.close();
    }
}
```

---

## 🔑 Summary
- **Hard-coding**: Direct assignment in code.  
- **Scanner**: Best for console input/output. Can handle multiple data types.  
- **JOptionPane**: Simple GUI dialogs, but always returns Strings.  
- **JavaFX**: More advanced, used for full GUI applications.  
