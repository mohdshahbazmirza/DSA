class MyHashSet {
    int arr[]=new int[1000002];
    /** Initialize your data structure here. */
    public MyHashSet() {
        
    }
    
    public void add(int key) {
        arr[key]=key+1;
    }
    
    public void remove(int key) {
        arr[key]=0;
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        if(arr[key]==key+1)
            return true;
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */