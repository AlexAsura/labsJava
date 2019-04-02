package ua.nure.serdsov.task1;

class Part1 {
  public static void main(String[] args) {
    int[] nums = new int[args.length];
    for (int i = 0; i < args.length; i++) {
      nums[i] = Integer.parseInt(args[i]);
    }
    System.out.println(sum(nums));

  }

  public static int sum(int[] nums) {
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
    }
    return sum;
  }
}