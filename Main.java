import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main { 
    public static void main(String[] args) {
        testStringArray();
        testDoubleArray();
        checkParentheses();
    }
    
    // Other methods...

    public static void checkParentheses() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("equations.txt"));
            String line;
            Stack<Character> stack = new Stack<>();

            while ((line = reader.readLine()) != null) {
                for (char c : line.toCharArray()) {
                    if (c == '(') {
                        stack.push(c);
                    } else if (c == ')') {
                        if (stack.isEmpty() || stack.pop() != '(') {
                            System.out.println("Incorrect parentheses placement.");
                            return;
                        }
                    }
                }
            }

            if (stack.isEmpty()) {
                System.out.println("Correct parentheses placement.");
            } else {
                System.out.println("Incorrect parentheses placement.");
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
