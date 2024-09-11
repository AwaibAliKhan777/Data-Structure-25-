public class Main {

    // Function to find the maximum subarray sum using Kadane's Algorithm
    public static int MaximumSubarray(int[] arr) {
        // If the array is empty, return 0 (no subarray)
        if (arr.length == 0) {
            return 0;
        }

        // Initialize maxCurrent and maxGlobal with the first element of the array
        int maxCurrent = arr[0];
        int maxGlobal = arr[0];

        // Traverse through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // Update maxCurrent to either the current element or the sum of maxCurrent and the current element
            // This ensures that maxCurrent will either start a new subarray or extend the existing subarray
            maxCurrent = Math.max(arr[i], maxCurrent + arr[i]);

            // Update maxGlobal if maxCurrent is greater than the current maxGlobal
            maxGlobal = Math.max(maxGlobal, maxCurrent);
        }

        // Return the maximum subarray sum
        return maxGlobal;
    }

    public static void main(String[] args) {
        // Test case 1: Mixed positive and negative numbers
        // Expected output: 7 (subarray: [4, -1, -2, 1, 5])
        System.out.println(MaximumSubarray(new int[] { -2, -3, 4, -1, -2, 1, 5, -3 }));

        // Test case 2: All positive numbers
        // Expected output: 15 (subarray: [1, 2, 3, 4, 5])
        System.out.println(MaximumSubarray(new int[] { 1, 2, 3, 4, 5 }));

        // Test case 3: All negative numbers
        // Expected output: -1 (subarray: [-1], the largest single element)
        System.out.println(MaximumSubarray(new int[] { -1, -2, -3, -4, -5 }));

        // Test case 4: Empty array
        // Expected output: 0 (no elements to form a subarray)
        System.out.println(MaximumSubarray(new int[] {}));
    }
}
