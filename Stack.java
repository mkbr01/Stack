// trade off between running time of a algorithm memory complexity

public class Stack<T extends Comparable<T>> {

    private Node<T> root;
    private int count;


    //o(1), linear time
    public void push(T newData) {

        this.count++;

        if (this.root == null) {
            this.root = new Node<>(newData);
        } else {
            Node<T> oldRoot = this.root;
            this.root = new Node<>(newData);
            this.root.setNextNode(oldRoot);
        }
    }


    //o(1)
    public T peek() {
        return this.root.getData();
    }

        //o(1), pop method
        public T pop() {
            T itemToPop = this.root.getData();
            this.root = this.root.getNextNode();
            this.count--;
            return itemToPop;
        }

        //o(1) size of stack
        public int size() {
            return this.count;
        }

        //o(1)
        public boolean isEmpty() {
            return this.root == null;
        }

    }





















