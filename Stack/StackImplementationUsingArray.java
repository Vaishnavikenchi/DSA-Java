class StackImplementationUsingArray {
    int top = -1;
    int size = 5;
    int stack[] = new int[size];

    void push(int x) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = x;
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println("Popped: " + stack[top--]);
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack Empty");
            return;
        }
        System.out.println("Top: " + stack[top]);
    }

    public static void main(String[] args) {
        StackImplementationUsingArray s = new StackImplementationUsingArray();
        s.push(10);
        s.push(20);
        s.peek();
        s.pop();
    }
}
