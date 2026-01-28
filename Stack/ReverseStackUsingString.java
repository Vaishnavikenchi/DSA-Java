class ReverseStackUsingNumbers
{
    public static void main(string args[])
    {
        int stack1[]=new int[5];
        int stack2[]=new int[5];

        int top1=-1;
        int top2=-1;

        stack1[++top1]=10;
        stack1[++top1]=20;
        stack1[++top1]=30;

        System.out.println("Original Stack");
        for(int i=0;i<=top1;i++)
        {
            System.out.println(stack1[i]+" ");
        }
        while(top1!=-1)
        {
            stack2[++top2]=stack1[top1--];
        }
        System.out.println("Reversed Stack:");
        for(int i=0;i<=top2;i++)
        {
            System.out.println(stack2[i]+" ");
        }
    }
}