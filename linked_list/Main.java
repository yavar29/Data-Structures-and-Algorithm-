public class Main {

    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insert(6);
        list.insert(24);
        list.insert(52);
        list.insert(33);
        list.insertAtStart(276);
        list.insertAt(3,99);
        list.deleteAt(2);

        list.show();

    }
}

