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
    Node pop(Node head){
        Node temp=head;

        while (temp.next!=top){
            temp=temp.next;

        }
        this.top=temp;
        temp=temp.next;
        top.next=null;
        return temp;



    }
    Node peek(){
        return top;
    }



}
class Queue{

    Node front;
    Node rear;

    Queue(Node head){
        this.front=head;
        this.rear=head;

    }

    void enqueue(Node head,int value){

        Node newnode =new Node(value);

        if(head.next==null){

            head.next=newnode;
            front=head.next;
            rear=head.next;
            return;

        }

        this.rear.next=newnode;
        this.rear=newnode;




    }


    int dequeue(Node head){
        Node temp=head.next;


        if(this.front==this.rear){
            this.front=head;
            this.rear=head;

           head.next=null;
           return temp.data;

        }

        head.next=this.front.next;
        this.front=head.next;

        return temp.data;




    }






}

public class Stack_Queue {


    public static void main(String[] args){
        Node head=new Node();

        Stack stack=new Stack(head);

        stack.push(70);
        stack.push(30);
        stack.push(56);



        System.out.println("Stack:");
        while(stack.top!=head){
            System.out.println(stack.peek().data);
            stack.pop(head);
        }
        Node head1=new Node();

        Queue queue=new Queue(head1);

        queue.enqueue(head1,56);
        queue.enqueue(head1,30);
        queue.enqueue(head1,70);

        System.out.println("Queue:");

        while (queue.front!=head1){
            System.out.println(queue.dequeue(head1));
        }




    }
}

