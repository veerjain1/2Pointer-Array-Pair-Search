class Main {
  public static void main(String[] args) {
    int [] arr = {1,2,3,4,5,6,7,8,9};
    int sum = 7;

   boolean found =  findPairWithSum(arr, sum);

    System.out.println("It is...."+found);
  }


  public static boolean findPairWithSum(int[] arr, int sum) {
    int left = 0;
    int right = arr.length - 1;
    while (left < right) {
        int currentSum = arr[left] + arr[right];
        if (currentSum == sum) {
            return true;
        } else if (currentSum < sum) {
            left++;
        } else {
            right--;
        }
    }
    return false;
}


  
}