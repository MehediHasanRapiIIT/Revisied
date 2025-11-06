//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    Node head;
    private int size;
    public Main() {
        this.size = 0;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }


    //add first
    public void addFirst(String data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    //add last
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //print

    public void print(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    //deletefirst
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    //deleteLast
    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public int getSize(){
        return size;
    }


    private void insertAtLocaton(int location, String data){

        int count = 0;
        Node current, previous;
        current = previous = head;

        Node node = new Node(data);

        if(location <=1){
            node.next = head;
            head = node;
        }else{
            while(current.next != null && ++count != location){
                previous = current;
                current = current.next;

            }
            node.next = previous.next;
            previous.next = node;
        }
        size++;
    }

    private void deleteAtLocaton(int location){
        if(head != null){

            if(location <=1){
                head = head.next;

            }else{

                int count = 0;
                Node current, previous;
                previous = current =  head;
                while(current.next != null && ++count != location){
                    previous = current;
                    current = current.next;
                }

                if(count >= location){
                    previous.next = current.next;
                }else{
                    System.out.println("wrong location");
                }

            }
            size--;


        }else{
            System.out.println("List is empty");
        }

    }

    public void reverseIterator(){

    }


    public static void main(String[] args) {

        Main list = new Main();
        list.addFirst("1");
        list.addLast("2");
        list.addLast("3");
        list.print();
        list.addFirst("4");
        list.addLast("5");
        list.print();
        list.insertAtLocaton(2,"6");
        list.print();

        list.deleteFirst();
        list.print();
        list.deleteLast();
        list.print();
        list.deleteAtLocaton(3);
        list.print();

        System.out.println(list.getSize());

    }
}
