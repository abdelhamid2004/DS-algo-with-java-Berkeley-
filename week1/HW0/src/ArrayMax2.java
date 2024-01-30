public class ArrayMax2 {
    /**
     * max: Function to find the max element in the array
     * @arr[]: The array to find the max element
     * Return: The function will return the max element (maxi)
     */
    public static int max(int arr[])
    {
        int length = arr.length, maxi = arr[0];
        for (int i = 0; i < length; i++)
        {
            if (arr[i] > maxi){
                maxi = arr[i];
            }
        }
        return maxi;
    }
    public static void main(String[] args)
    {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(max(numbers));
    }
}