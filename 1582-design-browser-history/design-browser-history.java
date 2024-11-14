class BrowserHistory {
List<String> arr=new ArrayList<>();
int i=0;
    public BrowserHistory(String homepage) {
     arr.add(homepage);  
     i=0; 
    }
    public void visit(String url) {
     while(arr.size()>i+1){
        arr.remove(arr.size()-1);
     }
     arr.add(url); 
     i++;
    }
    public String back(int steps) {
        i=Math.max(i-steps,0);
        return arr.get(i);
    }
    public String forward(int steps) {
        i=i+steps;
        if(i>=arr.size()){
            i=arr.size()-1;
        }
        return arr.get(i);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */