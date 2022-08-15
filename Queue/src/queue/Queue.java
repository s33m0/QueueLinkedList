
package queue;
class QueueLinkedList<T>{
    Node front,rear;

    // Method to add an key to the queue.

    void enQueue(T element)
    {
        Node newNode=new Node(element);
        if (front == null) 
        {
            front = newNode;
            rear = newNode;
        }
        else {

            rear.next = newNode;
            rear = newNode;
             }
    }
    
    
   // Method to remove an key from queue.
      T deQueue(){
        Node n= front;
        front= front.next;
         return (T) n.value;
      }
         void Display(){
        Node n=front;
        while (n!=null) {            
            System.out.println(n.value);
            n=n.next;
        }
    }
}

public class Queue {

    public static void main(String[] args) {

        QueueLinkedList<Integer> q=new QueueLinkedList<>();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.deQueue();
        q.Display();

    }
    
}
