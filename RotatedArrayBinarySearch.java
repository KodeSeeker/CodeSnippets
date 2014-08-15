int rotated_binary_search(int A[], int N, int key) {
  //A[]=[4,5,6,7,0,1,2]
  int L = 0;
  int R = N - 1;//N=A.length
   while (L <= R) {// end condition
    // Avoid overflow, same as M=(L+R)/2
    int M = L + ((R - L) / 2);
    // Case 0. best case, the element we are looking for is the mid element.
   if (A[M] == key) return M;
 
    //Case 1.
    // the bottom half is sorted
    if (A[L] <= A[M]) {
      if (A[L] <= key && key < A[M])//key is greater than lower bound and less than the middle element.
        R = M - 1;// set upper bound to M-1
      else
        L = M + 1;// set lower bound to M+1
    }
    // the upper half is sorted
    else {//(A[M]<=A[R])
      if (A[M] < key && key <= A[R])
        L = M + 1;
      else 
        R = M - 1;
    }
  }
  return -1;// not found
}