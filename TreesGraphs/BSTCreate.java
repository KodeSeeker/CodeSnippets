public static Node addToTree(int arr[], int start, int end){
  if (end < start) {
    return null;
  }
   int mid = (start + end) >>1;
   Node n = new TreeNode(arr[mid]);// root
   n.left = addToTree(arr, start, mid - 1);//left child
   n.right = addToTree(arr, mid + 1, end);//right child
   return n;
}

   public static Node createMinimalBST(int array[]) {
      return addToTree(array, 0, array.length - 1);
    }
