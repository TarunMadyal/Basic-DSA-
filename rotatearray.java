
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int last = nums[nums.length-1];
        for(int i=nums.length-1; i>0; i--){
            nums[i] = nums[i-1];
        }
        nums[0] = last;
    System.out.print(Arrays.toString(nums));
}
}
