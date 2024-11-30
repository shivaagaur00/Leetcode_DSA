class Solution {
    public double maxProbability(int n, int[][] edges, double[] arr, int start_node, int end_node) {
        double len[]=new double[n];
        Arrays.fill(len,0.0);
        len[start_node]=1.0;
        for(int j=0;j<n-1;j++){
            boolean flag=false;
            for(int i=0;i<edges.length;i++){
                int a=edges[i][0];
                int b=edges[i][1];
                double weight=arr[i];
                if(weight*len[b]>len[a]){
                    len[a]=weight*len[b];
                    flag=true;
                }
                if(weight*len[a]>len[b]){
                    len[b]=weight*len[a];
                    flag=true;
                }
            }
            if(!flag) break;
        }
        return len[end_node];
    }
}