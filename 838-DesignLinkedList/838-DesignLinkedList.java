// Last updated: 8/14/2026, 10:49:08 AM
class MyLinkedList {
    class Node{
        int val;
        Node next;
        Node(int val)
        {
            this.val = val;
            next = null;
        }
    }
    Node head,tail;
    int count;
    public MyLinkedList() {
        head = tail = null;
        count = 0;   
    }
    
    public int get(int index) {
        if(index < 0||index>=count) return -1;
        Node temp = head;
        for(int i=0;i<index;i++)
        {
            temp = temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node nn = new Node(val);
        if(head==null)
        {
            head = nn;
            tail = nn;
        }
        else
        {
            nn.next = head;
            head = nn;
        }
        count+=1;
    }
    
    public void addAtTail(int val) {
        Node nn = new Node(val);
        if(head==null)
        {
            head = nn;
            tail = nn;
        }
        else
        {
            tail.next = nn;
            tail = nn;
        }
        count+=1;
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0||index>count) return ;
        
        if(index==0){
            addAtHead(val);
            return;
        }
        else if(index==count)
        {
            addAtTail(val);
            return;
        }
        else
        {
            Node temp = head;
            Node nn = new Node(val);
            for(int i=0;i<index-1;i++)
            {
                temp = temp.next;
            }
            nn.next = temp.next;
            temp.next = nn;
        }
        count+=1;
    }
    
    public void deleteAtIndex(int index) {
        
        if(index<0||index>=count)
        {
            return;
        }
        if(index == 0) 
        {
            head = head.next;
            if(head == null) tail = null;
        } 
        else
        {
        Node temp = head;
        for(int i = 0; i < index - 1; i++)
        {
            temp = temp.next;
        }
        temp.next = temp.next.next;

        if(index == count - 1)
        {
            tail = temp;
        }
    }
    count--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */