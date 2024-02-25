/*
 * Linked List
 * 1. Costructor
 * 2. GetHead
 * 3. GetTail
 * 4. GetLenth
 * 5. Append(Value) -- Adding to the last;
 * 6. Prepend(Value) -- Adding to Begining.
 * 7. Remove first -- Remove form first.
 * 8. Remove Last -- Remove form Last.
 * ------------------------------------
 * Main()
 * 1. Get(Index) - Return True and false
 * 2. Set(Index, Value) - Set the value.
 * 3. Insert (Index, Value) = AddFirst, AddLast, Add from Location.
 * 4. Remove (Index) = RemoveFirst, RemoveLast, Remeove from index 
 * 5. Reverse.
 * *************************************
 * Linked List
 * *************************************
 */

class  LinkedList{

    private Node head;
    private Node tail;
    private int length;

    LinkedList(int value)               // Constructor is called when newNode of linkedlis is created.
    {
        Node NewNode = new Node(value);
        head =  NewNode;
        tail = NewNode;
        length = 1;
    }
    void GetHead(){                                     // Display head
        System.out.println(" Head   :   " +head.value);
    }       
    void GetTail(){                                     //Display tail
        System.out.println(" Tail   :   " +tail.value);
    }
    void GetLength(){                                   //Display Lenth of linkedlist
        System.out.println("Length  :   " +length);
    }
    void Appedn(int Value){
        Node NewNode = new Node(Value);
        if(length == 0){
            head = NewNode;
            tail = NewNode;
        }
        else{
            tail.next = NewNode;
            tail = NewNode;
        }
    }
    void Prepend(int value){
        Node NewNode = new Node(value);
        if( length == 0){
            head = NewNode;
            tail = NewNode;
        }
        else{
            head.next = NewNode;
            head = NewNode;
        } 
    }
    public Node RemoveFirst(){
        if (length == 0) { return null;   
        }
        Node temp =  head;
        head = head.next;
        temp.next = null;
        length--;
        if(length == 0){
            tail =  null;
        }
        return temp;
    }
    public Node RemoveLast(){
        if(length == 0) return null;
        Node temp = head;
        Node Pre =  head;
        while(temp != null){
            Pre = temp;
            temp = temp.next;
        }
        tail = Pre;
        tail.next = null;
        length--;
        if(length == 0){
            head =  null;
            tail = null;
        }
        return temp;
    }
    void PrintList(){
        Node temp = head;
        System.out.println("Linked List :   ");
            while(head != null)
            {
                System.out.println(temp.value);
                temp = temp.next;
            }
    }
    Node get(int index){
        if(index == 0 || index >= length) return null;
        Node temp = head;
        for(int i = 0 ; i < length; i++){
            temp = temp.next;
        }
        return temp;
    }
    public boolean set(){
        return null;
    }
    public node Insert(int Index){

    }
    public node remove(int Index){

    }
    public static void main(String[] args) {
        LinkedList ll =  new LinkedList(1);
        ll.Appedn(2);
        ll.Appedn(5);
        ll.Appedn(3);
        ll.PrintList();

        ll.GetHead();
        ll.GetTail();
        ll.GetLength();
        ll.PrintList();
        System.out.println("*******New Series********");;
    }

 }
 

