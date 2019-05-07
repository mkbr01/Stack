public class main {

    public static void main(String[] args) {

        Stack<Integer> myStack = new Stack<>();

        myStack.push(8);
        myStack.push(250);
        myStack.push(500);


        System.out.println(myStack.size());
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());


    }
}
