// Returns maximum repeating element in arr[0..n-1].
// The array elements are in range from 0 to n-1

int maxRepeating(int[] arr)
{
    int len= arr.length;
    // Iterate though input array, for every element
    // arr[i], increment arr[arr[i]%k] by k
    for (int i = 0; i< len; i++)
        arr[arr[i]%len] += len;
 
    // Find index of the maximum repeating element
    int max = arr[0], result = 0;
    for (int i = 1; i < len; i++)
    {
        if (arr[i] > max)
        {
            max = arr[i];
            result = i;
        }
    }
 
    /* Uncomment this code to get the original array back
       for (int i = 0; i< n; i++)
          arr[i] = arr[i]%k; */
 
    // Return index of the maximum element
    return result;
}