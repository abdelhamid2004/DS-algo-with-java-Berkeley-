public class triangle
{
    /**
     * print_triangle: Function take number of rows and draw a triangle
     * @rows: The number of rows in the trianle
     * */
    public static void print_triangle(int rows)
    {
        int astrik;
        astrik=1;
        while(rows > 0)
        {
            int k=0;
            while (k < astrik)
            {
                System.out.print("* ");
                k++;
            }
            System.out.println();
            rows--;
            astrik++;
        }
    }
    public static void main(String[] args)
    {
        print_triangle(10);
    }
}