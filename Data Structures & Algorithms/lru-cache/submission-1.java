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
        hmap =new HashMap<Integer, Node>();
        head =new Node(-1,-1);
        tail = new Node(-1,-1);
        head.next = tail;
        tail.prev = head;
        
    }
    
    public int get(int key) {
        if(hmap.containsKey(key)){
            Node node =hmap.get(key);
           delete(node);
            add(node);
            hmap.put(key,head.next);
            return node.val;
        }

        return -1;
        
        
    }
    private void add(Node newnode) {
        Node temp =head.next;
        head.next=newnode;
        newnode.next = temp;
        newnode.prev=head;
        temp.prev = newnode;
        

        
    }
     public void delete(Node p){
        p.prev.next =p.next;
        p.next.prev=p.prev;
        
     }
    
    public void put(int key, int value) {
        if(hmap.containsKey(key)){
            Node node =hmap.get(key);
            node.val =value;
            delete(node);
            add(node);
             hmap.put(key,head.next);


        }
        else{
            if(hmap.size()==size){
                Node  prev =tail.prev;
                delete(prev);
                Node node = new Node(key, value);
                add(node);
                hmap.put(key,head.next);
                hmap.remove(prev.key);

            }

            else{
            Node node = new Node(key, value);
            add(node);
            hmap.put(key,head.next);
            }
           
        }
        
        
        
    }
}
