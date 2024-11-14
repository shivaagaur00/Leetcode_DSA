class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        for(String st:operations){
            if(st.equals("C")) stack.pop();
            else if(st.equals("D")) stack.push(stack.peek()*2);
            else if(st.equals("+")){
                int a=stack.pop();
                int b=stack.pop();
                stack.push(b);
                stack.push(a);
                stack.push(a+b);
            }
            else stack.push(Integer.parseInt(st));
                    System.out.println(stack);
        }
        System.out.println(stack);
        int ans=0;
        while(!stack.isEmpty()){
            ans+=stack.pop();
        }
        return ans;
    }
}