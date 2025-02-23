public class Node {
    String data;
    private next;
    
    //constructor
    public Node(String data){
        this.data = data;
    }

    //getter and setter
    public void setNextNode(Node node) {
        node.next = node;
    }
    public Node getNextNode {
        return this.next;
    }
}