import java.util.Stack;

public class StackSort {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // Example stack initialization
        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);
        stack.push(92);
        stack.push(23);

        System.out.println("Original Stack: " + stack);

        Stack<Integer> sortedStack = sortStackDescending(stack);

        System.out.println("Sorted Stack in Descending Order: " + sortedStack);
    }

    public static Stack<Integer> sortStackDescending(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();

        while (!stack.isEmpty()) {
            // Pop an element from the original stack
            int current = stack.pop();

            // While temporary stack is not empty and the top of the temp stack is less than the current element
            while (!tempStack.isEmpty() && tempStack.peek() < current) {
                // Move elements from temp stack back to original stack
                stack.push(tempStack.pop());
            }

            // Push the current element onto the temp stack
            tempStack.push(current);
        }

        return tempStack;
    }
}
