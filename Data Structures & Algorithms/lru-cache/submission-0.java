class Node{
    int key;
    int val;
    Node next;
    Node prev;
    Node(int key,int value){
        this.key =key;
        this.val =value;
        next =null;
        prev =null;
    }
}
class LRUCache {
    int size ;
    HashMap<Integer, Node> hmap;
    Node head;
    Node tail;

    public LRUCache(int capacity) {
        size = capacity;
        hmap= new HashMap<>();
        head = new Node(-1,-1);
        tail = new Node(-1,-1);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(hmap.containsKey(key)){
            Node node = hmap.get(key);
            delete(node);
            add(node);
            hmap.put(key, head.next);
            return node.val;
        }

        return -1;
        
    }
    private void add(Node newnode) {
        Node temp=head.next;
        head.next = newnode;
        newnode.next =temp;
        newnode.prev=head;
        
        temp.prev =newnode;
    }
     public void delete(Node p){
        Node prev =p.prev;
        Node next = p.next;
        prev.next =next;
        next.prev=prev;
     }
    
    public void put(int key, int value) {
        if(hmap.containsKey(key)){
            Node node = hmap.get(key);
            delete(node);
            node.val =value;
            add(node);
            hmap.put(key, head.next);
        }
        else{
            if(hmap.size()==size){
            Node prev =tail.prev;
            delete(prev);
            Node node =new Node(key,value);
            add(node);
            hmap.remove(prev.key);
            hmap.put(key, head.next);
            }
            else{
            Node node =new Node(key,value);
            add(node);
           
            hmap.put(key, head.next); 
            }
        }
        
        
    }
}
