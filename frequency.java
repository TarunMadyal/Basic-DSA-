// Count Frequency of Each Element
//  For each unique element, print how many times it appears.
class Main {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,4,5,6,6,6,6};
        boolean[] visited = new boolean [nums.length];
        
        for(int i=0; i<nums.length; i++){
            if(visited[i])continue;
             
            int count = 1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){;
                visited[j] = true;
                count++;
            }
        }
        System.out.println(nums[i] + " : "+ count);
        }    
    }
}
    
