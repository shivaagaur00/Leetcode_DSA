class Solution {
    public boolean isValidSerialization(String preorder) {
        int count=1;
        String[] arr=preorder.split(",");
        int i=0;
        while(i<arr.length){
            if(count<=0) return false;
            if(!arr[i].equals("#")) count++;
            else count--;
            i++;
        }
        return count==0;
    }
}