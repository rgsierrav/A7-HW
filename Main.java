import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        testStringArray();
        testDoubleArray();
        checkParenthesesInFile("equations.txt");
    }

    private static void testStringArray() {
        Array<String> arr = new Array<>(1, "Hello");
    
        arr.add("world");
        arr.add("!");
        System.out.println("***Testing constructor***\nExpected: [Hello, world, !]\nActual: " + arr);
    
        System.out.println("\n***Testing getSize***\nExpected: 3\nActual: " + arr.getSize());
    
        System.out.println("\n***Testing get***\nExpected: world\nActual: " + arr.get(1));
    
        arr.set(1, "people");
        System.out.println("\n***Testing set***\nExpected: people\nActual: " + arr.get(1));
    
        arr.add("new element");
        System.out.println("\n***Testing add***\nExpected: new element\nActual: " + arr.get(3));
    
        System.out.println("\n***Testing remove***\nExpected: true\nActual: " + arr.remove("new element"));
    }

    private static void testDoubleArray() {
        Array<Double> arr = new Array<>(1, 3.14);
    
        arr.add(5.2);
        System.out.println("\n***Testing constructor***\nExpected: [3.14, 5.2]\nActual: " + arr);
    
        System.out.println("\n***Testing getSize***\nExpected: 2\nActual: " + arr.getSize());
    
        System.out.println("\n***Testing get***\nExpected: 5.2\nActual: " + arr.get(1));
    
        arr.set(1, 2.5);
        System.out.println("\n***Testing set***\nExpected: 2.5\nActual: " + arr.get(1));
    
        arr.add(90.1);
        System.out.println("\n***Testing add***\nExpected: 90.1\nActual: " + arr.get(2));
    
        System.out.println("\n***Testing remove***\nExpected: true\nActual: " + arr.remove(90.1));
    }    

    private static void checkParenthesesInFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                boolean isBalanced = checkParentheses(line);
                System.out.println("Expression: " + line + " is " + (isBalanced ? "balanced" : "not balanced"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean checkParentheses(String expression) {
        Stack<Character> stack = new Stack<>();
        for (char ch : expression.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
