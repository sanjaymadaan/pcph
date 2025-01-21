class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxarea = 0;
        int left = 0;
        int right = height.length - 1;
    while(left < right){
        int currentarea = (right - left) * 
           ( height[left] < height[right] ? height[left] : height[right]);
        if(currentarea > maxarea){
            maxarea = currentarea;
        }
        if(height[left] < height[right])
            left++;
        else
            right--;
    }
    return maxarea;
    }
}
