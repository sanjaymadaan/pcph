class Solution {

    public int towerOfHanoi(int n, int from, int to, int aux) {
        // Your code here
        return (int)Math.pow(2,n) - 1;
    }
}
