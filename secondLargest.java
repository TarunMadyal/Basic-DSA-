class Main {
    public static void main(String[] args) {
        int[] nums = {1, 20, 3, 4, 5};

        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                second = max;
                max = nums[i];
            } else if (nums[i] > second && nums[i] != max) {
                second = nums[i];
            }
        }

        System.out.println("Second Largest: " + second);
    }
}
