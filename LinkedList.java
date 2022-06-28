public class LinkedList{
    private Node head = null;
    private int size = 0;
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void addNode(int data){
        Node n = new Node(data);
        if(size==0){
            head = n;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = n;
        }
        size++;
    }
    public boolean addNodeAfter(int data, int addAfter){
        Node n = new Node(data);
        Node temp = head;
        while(temp.data != addAfter){
            temp = temp.next;
        }
        if(temp.data == addAfter){
            n.next = temp.next;
            temp.next = n;
            size++;
            return true;
        }
        return false;
    }
    public boolean deleteNode(int data){
        Node temp = head;
        Node temp2 = head;
        while(temp.data != data){
            temp2 = temp;
            temp = temp.next;
        }
        if(temp.data == data){
            temp2.next = temp.next;
            temp.next = null;
            return true;
        }
        return false;
    }
    public void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.println("The data is: "+temp.data);
            temp = temp.next;
        }
    }
    public void reverseList(Node head){
        Node curr = head;
        Node prev = null;
        Node next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
    }
    public static void main(String[] args) {
        // Node newNode = new Node(9);
    }
}