package Stacks;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementationOfStackUsingQueue {

    private Queue<Integer> queue;
        public ImplementationOfStackUsingQueue() {
            queue = new LinkedList<>();
        }

        // Push operation (costly)
        public void push(int x) {
            int size = queue.size();
            queue.add(x); // Add new element

            // Rotate all previous elements behind the new element
            for (int i = 0; i < size; i++) {
                queue.add(queue.remove());
            }
        }

        // Pop operation (efficient)
        public int pop() {
            if (queue.isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }
            return queue.remove();
        }

        // Peek operation (top element)
        public int peek1() {
            if (queue.isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }
            return queue.peek();
        }

        // Check if stack is empty
        public boolean isEmpty() {
            return queue.isEmpty();
        }

        public static void main(String[] args) {
            ImplementationOfStackUsingQueue stack = new ImplementationOfStackUsingQueue();

            stack.push(10);
            stack.push(20);
            stack.push(30);

            System.out.println("Top element: " + stack.peek1()); // 30
            System.out.println("Popped element: " + stack.pop()); // 30
            System.out.println("Top element after pop: " + stack.peek1()); // 20
        }
    }



