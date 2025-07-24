class Solution {
    public int maxArea(int[] height) {
        int lp = 0;
        int rp = height.length-1;
        int Max_water = 0;
        while(lp < rp){
            int width = rp - lp;
            int minheight = Math.min(height[lp],height[rp]);
            int current_water = width*minheight;
            Max_water = Math.max(Max_water,current_water);
            if(height[lp]<height[rp]){
                lp++;
            }else{
                rp--;
            }  
        }
        return Max_water;
        }
    }
