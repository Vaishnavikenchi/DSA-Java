import java.util.ArrayList;

class AlternateElement
{
    public static void main(String args[])
    {
        int[] arr={10,20,30,40,50};

        ArrayList<Integer> result=new ArrayList<>();

        for (int i=0;i<arr.length;i=i+2)
        {
            result.add(arr[i]);
        }
        System.out.println("Alternate Elements:"+result);
    }
}