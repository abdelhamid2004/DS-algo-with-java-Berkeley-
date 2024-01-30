public class HelloNumbers
{
    public static void  main(String[] args)
    {
        for (int i = 0; i < 10; i++)
        {
            int sum = i * (i+1) / 2;
            System.out.print(sum + " ");
        }
    }
}