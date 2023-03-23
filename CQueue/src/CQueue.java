public class CQueue {
    int SIZE =5;//size of circular queue
    int front,rear;
    int items[]=new int[SIZE];

    CQueue()
    {
        front=-1;
        rear=-1;
    }

    //check if the queue is full
    boolean isFull()
    {
        if(front==0 && rear ==-1)return true;
        if(front ==rear+1) return true;
        return false;
    }

    //check is the queue is empty
    boolean isEmpty()
    {
        if(front==-1) return true;
        else return false;
    }

    //adding an element
    void enQueue(int element)
    {
        if(isFull())
        {
            System.out.println("Queue is full");
        }else
        {
            if(front==-1) front =0;
            rear=(rear+1)%SIZE;
            items[rear]=element;
            System.out.println("inserted --> "+element);
        }
    }


    public static void main(String[] args)
    {
        System.out.println("Hello world!");
    }
}