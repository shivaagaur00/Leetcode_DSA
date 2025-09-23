class Solution {
    public int compareVersion(String version1, String version2) {
        String[] arr1=version1.split("\\.");
        String[] arr2=version2.split("\\.");
        int min=Math.min(arr1.length,arr2.length);
        for(int i=0;i<min;i++){
            if(Integer.parseInt(arr1[i])<Integer.parseInt(arr2[i])) return -1;
            else if(Integer.parseInt(arr1[i])>Integer.parseInt(arr2[i])) return 1;
        }
        if(arr1.length>arr2.length){
            for(int i=min;i<arr1.length;i++){
                if(Integer.parseInt(arr1[i])>0) return 1;
            }
        }
        else {
            for(int i=min;i<arr2.length;i++){
                if(Integer.parseInt(arr2[i])>0) return -1;
            }
        }
        return 0;
    }
}