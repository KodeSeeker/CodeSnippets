  
  /*Suppose we have an input array  a[]  consisting of   n  integers, each in the range  0 to k-1. 
  The counting-sort algorithm sorts using an auxiliary array of counters. It outputs a sorted version of  a[]
  as an auxiliary array b[] .The idea behind counting-sort is simple: For each i on 0 to k-1  , count the number of occurrences
  of i  in a[]   and store this in c[i]  . Now, after sorting, the output will look likec[0]   occurrences of 0, followed by c[1]   occurrences of 1, followed by  c[2]  occurrences of 2,...
  , followed by c[k-1]   occurrences of k-1  . 
  */
  
  
  int[] countingSort(int[] a, int k) {
        int c[] = new int[k]; //auxillary count array.
	//populate count array
	for(int i=0;i<a.length;i++)
		c[a[i]]++;
	//now in order to get the indexes right. Modify  count array to contain count of elements that are greater than it at every index.
	for(int i=1;i<c.length;c++)
		c[i]+=c[i-1];
        //auxiliary array to hold the original array.
	int[] b = new int [a.length];
	for(int i=a.length-1;i>=0;i--)
		b[--c[a[i]]]=a[i];// more here->http://www.opendatastructures.org/ods-java/11_2_Counting_Sort_Radix_So.html
	return b;
    }
