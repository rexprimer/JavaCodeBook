import java.security.PublicKey;

class DoublyLinkedList{
    
    private node head = null;
    private node tail =  null;
    private int length;


    DoublyLinkedList(int value){                //Constructor for Doublly LikedList
        node NewNode = new node(value);
        head = NewNode;
        tail = NewNode;
        length = 0;
    }
    private void Display(){
        node temp = head; 
        while (temp != null) { 
            System.out.print(temp.value + " --> "); 
            temp = temp.next; 
        } 
        System.out.println("NULL"); 
    }
    private void Insert_Beg(int value){                 //Insertion in the starting
        node NewNode = new node(value);
        if(head == null){
            head =  NewNode;
            tail = NewNode;
        }
        else{
            NewNode.next = head;
            head.prev = NewNode;
            head = NewNode;
            length++;
        }
    }
    private void Insert_End(int value){             //Insertion in the End
        node NewNode =  new node(value);
        if(head == null){
            head =  NewNode;
            tail = NewNode;
        }
        else{
            tail.next = NewNode;
            NewNode.prev = tail;
            tail = NewNode;
            length++;
        }

    }
    private void Insert_pos(int pos, int value)
    {
        node NewNode = new node(value);
        if(pos == 1){
            Insert_Beg(value);
        }
        node temp = head;
        int current = 1;
        while(temp != null && current<pos )
        {
            temp = temp.next;
            current++;
        }
        if(temp ==  null){
            Insert_End(value);
        }
        else{
            NewNode.next = temp.next;
            NewNode.prev = temp.prev;
            temp.prev.next = NewNode;
            temp.prev = NewNode;
        }
    }
    private void Delete_Beg()       //Deletion form list
    {
        if(head == null)            //if List is empty
            return;
        if(head == tail)            //if only one value in list
        {
            head = null;
            head = null;
            return;
        }
        node NewNode = head;
        head =  head.next;
        head.prev = null;
        NewNode.next = null;
        length--;
    }
    private void Delete_End()
    {
        if(head == null) return;
        if(head == tail){
            head = null;
            tail = null;
            return;
        }
        node NewNode = tail;
        tail = tail.prev;
        tail.next = null;
        NewNode.prev = null;
        length--;
    }
    private void Delete_Pos(int pos)
    {
        if(pos ==1) Delete_Beg();
        node current = head;
        int count = 0;
        while( current != null && count != pos){
            current = current.next;
            count++;
        }
        if(current ==  null){
            System.out.println("Position Wrong");
            return;
        }
        if(current == tail){
            Delete_End();
        }
        else{
            current.prev.next = current.next;
            current.next.prev = current.prev;
            current.next = null;
            current.prev = null;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList(1);
        System.out.println("Insert at End" );
        dll.Insert_End(2);
        dll.Insert_End(15);
        dll.Insert_End(4);
        dll.Insert_End(9);
        dll.Insert_End(16);
        dll.Insert_End(20);
        dll.Display();
        System.out.println("Insert at front" );
        dll.Insert_Beg(0);
        dll.Insert_Beg(-1);
        dll.Display();

        System.out.println("Insert at Postion" );
        dll.Insert_pos(3,100);
        dll.Display();
        System.out.println("Deletion from Front");
        dll.Delete_Beg();
        dll.Display();
        System.out.println("Deletion form End");
        dll.Delete_End();
        dll.Display();
        System.out.println("Deletion form Pos");
        dll.Delete_Pos(0);
        dll.Display();
    }
}