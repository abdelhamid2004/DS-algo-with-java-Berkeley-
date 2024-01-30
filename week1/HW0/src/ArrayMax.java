public class ArrayMax
{
    /**
     * max: Function to find the max element in the array
     * @arr[]: The array to find the max element
     * Return: The function will return the max element (maxi)
     */

    public static int max(int arr[])
    {
        int length = arr.length;
        int i = 0, maxi = arr[0];
        while(i < length)
        {
            if(arr[i] > maxi)
            {
                maxi = arr[i];
            }
            i++;
        }
        return maxi;
    }
    public static void main(String[] args)
    {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(max(numbers));
    }
}