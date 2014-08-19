int  search( arr[], key, low, high){
        mid = (low + (high-low) ) / 2;
        // key not present
        if(low > high)
                return -1;
        // key found
        if(arr[mid] == key)
                return mid;
        // if left half is sorted.
        if(arr[low] <= arr[mid]) {
                // if key is present in left half.
                if (arr[low] <= key && arr[mid] >= key) 
                        return search(arr,key,low,mid-1);
                // if key is not present in left hald..search right half.
                else                 
                        return search(arr,key,mid+1,high);
        }

        // if right half is sorted. 
        else    {
                // if key is present in right half.
                if(arr[mid] <= key && arr[high] >= key) 
                        return search(arr,key,mid+1,high);

                // if key is not present in right half..search in left half.
                else
                        return search(arr,key,low,mid-1);
        }
         
}