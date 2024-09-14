class Solution {
    public List<Integer> topStudents(String[] positive_feedback, String[] negative_feedback, String[] report, int[] student_id, int k) {
        int[][] arr=new int[student_id.length][2];
        Set<String> positiveSet = new HashSet<>(Arrays.asList(positive_feedback));
        Set<String> negativeSet = new HashSet<>(Arrays.asList(negative_feedback));
        for(int i=0;i<student_id.length;i++){
            int pos=0;
            int neg=0;
            String arr1[]=report[i].split(" ");
            for(String st:arr1){
                if(positiveSet.contains(st)) pos++;
                else if(negativeSet.contains(st)) neg++;
            }
            arr[i][0]=student_id[i];
            arr[i][1]=(pos*3)-(neg);
        }
        Arrays.sort(arr, (a,b) -> {
            if(a[1]==b[1]){
               return a[0] - b[0];
            }
            else{
               return b[1] - a[1];
            }
        });
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<k;i++){
            ans.add(arr[i][0]);
        }
        return ans;
    }
}