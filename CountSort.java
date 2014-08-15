  
  /*Suppose we have an input array  a[]  consisting of   n  integers, each in the range  0 to k-1. 
  The counting-sort algorithm sorts using an auxiliary array of counters. It outputs a sorted version of  a[]
  as an auxiliary array b[] .The idea behind counting-sort is simple: For each i on 0 to k-1  , count the number of occurrences
  of i  in a[]   and store this in c[i]  . Now, after sorting, the output will look likec[0]   occurrences of 0, followed by c[1]   occurrences of 1, followed by  c[2]  occurrences of 2,...
  , followed by c[k-1]   occurrences of k-1  . 
  */
  
  
  int[] countingSort(int[] a, int k) {
        int c[] = new int[k];
        for (int i = 0; i < a.length; i++)
            c[a[i]]++;
        for (int i = 1; i < k; i++)
            c[i] += c[i-1];
        int b[] = new int[a.length];
        for (int i = a.length-1; i >= 0; i--)
            b[--c[a[i]]] = a[i];
        return b;
    }