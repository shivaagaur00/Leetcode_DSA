class ProductOfNumbers {
List<Integer> arr;
    public ProductOfNumbers() {
        arr=new ArrayList<>();
    }
    
    public void add(int num) {
        arr.add(num);
    }
    public int getProduct(int k) {
        int ans=1;
        int i=arr.size()-1;
        while(k-->0){
            ans*=arr.get(i);
            i--;
        }
        return ans;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */