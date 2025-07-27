import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5};
        int[] copy = new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            copy[i] = nums1[i];
        }
        System.out.print(Arrays.toString(copy));
    }
}
