class MyHashSet {
    private boolean[] cl;
    public MyHashSet() {
       cl = new boolean[1000001]; 
    }
    
    public void add(int key) {
        cl[key] =true;
    }
    
    public void remove(int key) {
         cl[key] = false;
    }
    
    public boolean contains(int key) {
        return cl[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */