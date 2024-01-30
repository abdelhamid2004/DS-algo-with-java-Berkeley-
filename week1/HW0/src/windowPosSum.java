public class windowPosSum {
    /**
     * WindowPosSum: Function to replace every index with the sum of elements untill i + n
     * @a: The array that will work on
     * @n: the number of elements in one summition
     * */
    public static void windowPosSum(int[] a, int n)
    {
        for (int i = 0; i < a.length; i++)
        {
            int sum = 0;
            if (a[i] < 0)
            {
                System.out.print(a[i] + " ");
                continue;
            }
            for (int j = i; j < a.length && j <= i + n; j++)
            {
                sum += a[j];
            }
            a[i] = sum;
            System.out.print(sum + " ");
        }
    }
    public static void main(String[] args)
    {
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);
    }
}