class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int n=derived.length;
        if(n==1 && derived[0]==0) return true;
        if(n==1 && derived[0]==1) return false;
        int arr[]=new int[n];
        arr[0]=derived[0];
        for(int i=1;i<n;i++){
            if(i==(n-1)){
                if(derived[i]==1 && arr[i]==0 && arr[0]==1) return true;
                if(derived[i]==0 && arr[i]==0 && arr[0]==0) return true;
                if(derived[i]==0 && arr[i]==1 && arr[0]==1) return true;
                if(derived[i]==1 && arr[i]==1 && arr[0]==0) return true;
            }
            else if(arr[i]==0 && derived[i]==0) arr[i+1]=0;
            else if(arr[i]==0 && derived[i]==1) arr[i+1]=1;
            else if(arr[i]==1 && derived[i]==0) arr[i+1]=1;
            else if(arr[i]==0 && derived[i]==1) arr[i+1]=0;
        }
        return false;
    }
}