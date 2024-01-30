public class LargerDemo{
    /**
     * larger: Function to find the lager number
     * @x: The first number
     * @y: The second number
     * Return: The larger between them
     */
    public static int larger(int x,int y)
    {
        if(x > y)
        {
            return x;
        }
        else
        {
            return y;
        }
    }
    public static void main(String[] args)
    {
        System.out.println(larger(-5, 10));
    }
}
