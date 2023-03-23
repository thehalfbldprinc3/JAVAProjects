public class Stack
{
    private int[] arr;
    private int top;
    private int capacity;

    //creating a stack
    Stack(int size)
    {
        arr = new int[size];
        capacity=size;
        top=-1;
    }

    //add element into stack
    public void push(int x)
    {
        if(isFull())
        {
            System.out.println("OverFlown\nProgram Terminated\n");
            System.exit(1);
        }

        System.out.println("Inserting "+x);
        arr[++top]=x;
    }
    //remove element from stack
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack Empty");
            System.exit(1);
        }
        return arr[top--];
    }

    //Utility function to return the size of the stack
    public int size()
    {
        return top+1;
    }

    //check if the stack is empty
    public boolean isEmpty()
    {
        return top==-1;
    }

    //check if the stack is full
    public boolean isFull()
    {
        return top==capacity-1;
    }

    public void printStack()
    {
        for(int i =0;i<=top;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    //Driver code
    public static void main(String[] args)
    {
        Stack stack=new Stack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.pop();
        System.out.println("\nAfter Popping out");

        stack.printStack();

        System.out.println("size of the stack is: "+stack.size());
    }
}