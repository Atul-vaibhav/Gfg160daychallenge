/* Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.

Note: The second largest element should not be equal to the largest element.*/

// User function Template for Java

class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        
        int n = arr.length;
        
        if(n<2) return -1;
        
        for(int num : arr){
            if(num>first){
                second = first;
                first = num;
            }else if(num>second && num != first){
                second = num;
            }
        }
        return (second == Integer.MIN_VALUE) ? -1 : second;
    }
}