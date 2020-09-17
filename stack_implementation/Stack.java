public class Stack {
    Node head;

    public void push(int data){
        Node node= new Node();
        node.data=data;
        node.next=null;    // default


        if(head == null){
            head=node;
        }
        else{
            Node temp= head;
            while(temp.next != null){
                temp=temp.next;
            }
            temp.next=node;
        }
    }

    public void pop(){
        Node temp=head;
        Node n1;
        while(temp.next.next != null){
            temp=temp.next;
        }
        n1=temp.next;
        temp.next=n1.next;
        System.out.println("Deleted value: " + n1.data);
    }

    public void peek(){
        Node temp=head;
        while(temp.next != null){
            temp=temp.next;
        }
        System.out.println(temp.data);
    }

    public void show(){
        Node n=head;
        while(n.next !=null){
            System.out.print(n.data + " --> ");
            n=n.next;
        }
        System.out.print(n.data + " --> ");
        System.out.print(" null \n");

    }
}
