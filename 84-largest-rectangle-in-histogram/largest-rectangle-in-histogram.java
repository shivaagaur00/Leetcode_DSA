class Solution {
    public int largestRectangleArea(int[] arr) {
        int max = 0;
        List<Integer> leftarr=new ArrayList<>();
        List<Integer> rightarr=new ArrayList<>();
        int[] left=left(arr);
        int[] right=right(arr);
        for (int i = 0;i<arr.length;i++) {
            max=Math.max(max,(arr[i]*(right[i]-left[i]-1)));
        }
        return max;
    }
    public int[] left(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()){
                ans[i] = -1;
            }

            else{
                ans[i] = stack.peek();
            }
            stack.push(i);
        }
        return ans;
    }

    public int[] right(int arr[])  {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()){
                ans[i] = arr.length;
            }

            else{
                ans[i] = stack.peek();
            }
            stack.push(i);
        }
        return ans;
    }

}