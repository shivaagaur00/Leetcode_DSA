class Solution {
    public int elevatorRequests(int n, int[] req) {
        int count=req[0];
        for(int i=0;i<req.length-1;i++){
            count+=Math.abs(req[i+1]-req[i]);
           
        }
        
        return count;
        
    }
}