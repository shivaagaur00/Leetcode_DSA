class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int ans[]=new int[nums.length * 2];
        int arr[]=new int[nums.length * 2];
        int j=0;
        for (;j<nums.length;j++) {
            arr[j]=nums[j];
        }
        int k=0;
        for (;j<arr.length;j++) {
            arr[j]=nums[k++];
        }
        for (int i=arr.length-1;i>=0;i--) {
            while (!stack.isEmpty()&&stack.peek()<=arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty())
                ans[i] = -1;
            else
                ans[i] = stack.peek();
            stack.add(arr[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ans[i];
        }
        return nums;
    }
}