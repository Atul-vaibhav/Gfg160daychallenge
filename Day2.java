/*             Move All Zeroes to End

Given an array arr[]. Push all the zeros of the given array to the right end of the array
while maintaining the order of non-zero elements.Do the mentioned change in the array in place.*/

// User function Template for Java

class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int count = 0; // Index for placing non-zero elements

        for (int i = 0; i < arr.length; i++) {
            // If the current element is non-zero
            if (arr[i] != 0) {
                // Only perform the swap if i and count are different
                if (i != count) {
                    arr[count] = arr[i];
                    arr[i] = 0; // Place 0 in the current position
                }
                count++; // Move count to the next position
            }
        }
    }
}