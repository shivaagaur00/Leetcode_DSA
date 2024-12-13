class Solution {
    public int getKth(int lo, int hi, int k) {
      int[] arr=new int[1001];
      for(int i=1;i<1001;i++){
        arr[i]=ans(arr,i);
      }
      PriorityQueue<int[]> pq=new PriorityQueue<>(new Comparator<int[]>(){
        public int compare(int[]a,int[]b){
            return a[0]==b[0]?a[1]-b[1]:a[0]-b[0];
        }
      });
      for(int i=lo;i<=hi;i++){
        pq.add(new int[]{arr[i],i});
      }
      while(k-->1){
        pq.poll();
      }
      return pq.poll()[1];
    }
    public int ans(int []arr,int a){
        if(a==1) return 0;
        if(a<arr.length && arr[a]>0) return arr[a];
        int pow=a%2==0?a/2:3*a+1;
        int answer=1+ans(arr,pow);
        if(a<arr.length) arr[a]=answer;
        return answer;
    }
}