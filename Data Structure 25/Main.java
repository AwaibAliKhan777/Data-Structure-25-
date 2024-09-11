public class Main {
    public static int MaximumSubarray(int [] arr)
    {
        if(arr.length ==0)
        {
            return 0 ;
        }

        int maxcurrent = arr[0];
        int maxGlobal = arr[0];

        for(int i=1;i<arr.length;i++){
            maxcurrent = Math.max(arr[i], maxcurrent+ arr[i]);
            maxGlobal = Math.max(maxGlobal , maxcurrent);
        }
        return maxGlobal;
    }

    public static void main(String[] args) {
        System.out.println(MaximumSubarray(new int[] { -2, -3, 4, -1, -2, 1, 5, -3}));
        System.out.println(MaximumSubarray(new int[] {1,2,3,4,5}));
        System.out.println(MaximumSubarray(new int[] { -1,-2,-3,-4,-5}));
        System.out.println(MaximumSubarray(new int[] {}));
    }
    
}
