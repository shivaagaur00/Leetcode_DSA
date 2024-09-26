class MyCalendar {
List<int[]> arr;
    public MyCalendar() {
        arr=new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        for(int[] nums:arr){
            if(start<nums[1] && end>nums[0]){
                return false;
            }
        }
        arr.add(new int[]{start,end});
        Collections.sort(arr,(a,b) -> a[0] - b[0]);
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */