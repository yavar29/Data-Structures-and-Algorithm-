public class Main {
    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push(1);
        stack.push(45);
        stack.push(19);
        stack.push(33);
        stack.push(203);

        stack.pop();
        stack.show();

        stack.peek();

    }
}
