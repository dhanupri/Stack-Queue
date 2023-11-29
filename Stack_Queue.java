class Node{
    Node next;
    int data;
    Node(){
        next=null;
    }

    Node(int data){
        this.data=data;
        next=null;

    }
}
class Stack{

    Node top;

    Stack(Node head){
        top=head;

    }

    void push(int value){


        Node newnode=new Node(value);

        this.top.next=newnode;
        this.top=newnode;


    }
    


}

public class Stack_Queue {


    public static void main(String[] args){
        Node head=new Node();

        Stack stack=new Stack(head);

        stack.push(70);
        stack.push(30);
        stack.push(56);



    }
}

