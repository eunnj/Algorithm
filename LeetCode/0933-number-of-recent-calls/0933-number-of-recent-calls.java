class RecentCounter {

    Queue<Integer> q = new LinkedList<>();
    public RecentCounter() {
        
    }
    
    public int ping(int t) {
        q.add(t);


        while(q.peek() < t-3000)
        {
            q.poll();
        }

        return q.size();
    }
}
