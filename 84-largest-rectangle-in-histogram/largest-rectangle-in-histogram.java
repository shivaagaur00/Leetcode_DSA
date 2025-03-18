class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int left[]=new int[n];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && heights[stack.peek()]>=heights[i]) stack.pop();
            if(stack.isEmpty()) left[i]=-1;
            else left[i]=stack.peek();
            stack.push(i);
        }
        stack.clear();
        int[] right=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && heights[stack.peek()]>=heights[i]) stack.pop();
            if(stack.isEmpty()) right[i]=n;
            else right[i]=stack.peek();
            stack.push(i);
        }
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,(right[i]-left[i]-1)*heights[i]);
        }
        return max;

    }
}