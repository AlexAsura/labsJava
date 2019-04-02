package ua.nure.serdsov.task1;

class Part2 {
  public static void main(String[] args) {
    int[] nums = new int[args.length];
    for (int i = 0; i < args.length; i++) {
      nums[i] = Integer.parseInt(args[i]);
    }
    int[] a = reverse(nums);
    for (int j : a) {
      System.out.print(j + " ");

    }
    System.out.println();
  }

  public static int[] reverse(int[] nums) {
    int[] arr = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      arr[i] = nums[nums.length - i - 1];
    }
    return arr;
  }
}

