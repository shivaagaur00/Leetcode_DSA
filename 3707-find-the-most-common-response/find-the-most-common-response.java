class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        Set<String> st = new HashSet<>();
        Map<String, Integer> map = new HashMap<>();
        for (List<String> ls : responses) {
            for (String s : ls) {
                st.add(s);
            }
            for (String a : st) {
                map.put(a, map.getOrDefault(a, 0) + 1);
            }
            st.clear();
        }
        PriorityQueue<pair> pq = new PriorityQueue<>((a, b) -> {
            if (a.a != b.a) {
                return Integer.compare(b.a,a.a);
            }
            return a.s.compareTo(b.s);
        });
        for (String s : map.keySet()) {
            pq.add(new pair(s, map.get(s)));
        }
        pair p=pq.poll();
        // System.out.println(p.a+" "+p.s);
        return p.s;
    }
}

class pair {
    String s;
    int a;

    pair(String s, int a) {
        this.s = s;
        this.a = a;
    }
}