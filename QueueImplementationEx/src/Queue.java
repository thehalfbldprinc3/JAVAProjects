public class Queue
{
    int SIZE =5;
    int[] items=new int[SIZE];
    int front, rear;

    Queue()
    {
        front = -1;
        rear = -1;
    }

    boolean isFull()
    {
        if(front==0&&rear==SIZE-1)
        {
            return true;
        }
        return false;
    }

    boolean isEmpty()
        {
            if(front==-1) return true;
            else return false;
        }

        void enQueue(int element)
        {
            if(isFull())
            {
                System.out.println("Queue is full");
            }else
            {
              if(front==-1) front=0;
              rear++;
              items[rear]=element;
              System.out.println("Inserted "+element);
            }
        }

        int deQueue()
        {
            int element;
            if(isEmpty())
            {
                System.out.println("Queue is empty");
                return (-1);
            }else
            {
                element=items[front];
                if(front>=rear)
                {
                    front=-1;
                    rear=-1;
                }/*Queue has only one element, so we reset the queue after deleting it.*/
                else front++;

                System.out.println("Deleted ->"+element);
                return (element);
            }
        }

        void display()
        {
            //function to display elements of the queue
            int i;
            if(isEmpty())
            {
                System.out.println("Empty Queue");
            }else
            {
                System.out.println("\nFront index ->"+front);
                System.out.println("Items -> ");
                for (i=front;i<=rear;i++)
                    System.out.print(items[i]+" ");

                System.out.println("\nRear index -> "+rear);
            }
        }

    public static void main(String[] args)
    {
        Queue q=new Queue();

        //deQueue is not possible in empty queue
        q.deQueue();

        //enQueue 5 elements
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);

        //6th element cannot be added because the queue if full
        q.enQueue(6);

        //deQueue removes the element first added i.e. 1
        q.deQueue();

        //now we have just 4 elements
        q.display();
    }
}