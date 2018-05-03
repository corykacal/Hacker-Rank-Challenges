Node Insert(Node head, int data) {
    if(head==null) {
        head = new Node();
        head.data = data;
        head.next = null;
    } else {
        Node n = head;
        while(n.next!=null) {
            n = n.next;
        }
        n.next = new Node();
        n.next.data = data;
    }
    return head;
}
